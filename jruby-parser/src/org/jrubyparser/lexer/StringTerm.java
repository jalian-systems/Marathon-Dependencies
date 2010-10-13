/***** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2004 Jan Arne Petersen <jpetersen@uni-bonn.de>
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jrubyparser.lexer;

import org.jrubyparser.SourcePosition;
import org.jrubyparser.ast.RegexpNode;
import org.jrubyparser.ast.StrNode;
import org.jrubyparser.lexer.SyntaxException.PID;
import org.jrubyparser.parser.ReOptions;
import org.jrubyparser.parser.Tokens;
import org.jrubyparser.util.CStringBuilder;

public class StringTerm extends StrTerm {
    // Expand variables, Indentation of final marker
    private int flags;

    // Start of string ([, (, {, <, ', ", \n) 
    private final char begin;

    // End of string (], ), }, >, ', ", \0)
    private final char end;

    // How many strings are nested in the current string term
    private int nest;

    public StringTerm(int flags, int begin, int end) {
        this.flags = flags;
        this.begin = (char) begin;
        this.end   = (char) end;
        this.nest  = 0;
    }

    public int parseString(Lexer lexer, LexerSource src) throws java.io.IOException {
        boolean spaceSeen = false;
        int c;

        // FIXME: How much more obtuse can this be?
        // Heredoc already parsed this and saved string...Do not parse..just return
        if (flags == -1) {
            lexer.setValue(new Token("\"", lexer.getPosition()));
            return Tokens.tSTRING_END;
        }

        c = src.read();
        if ((flags & Lexer.STR_FUNC_QWORDS) != 0 && Character.isWhitespace(c)) {
            do {
                c = src.read();
            } while (Character.isWhitespace(c));
            spaceSeen = true;
        }

        if ((processingEmbedded == IGNORE_EMBEDDED || processingEmbedded == LOOKING_FOR_EMBEDDED) && (c == end) && (nest == 0)) {
            if ((flags & Lexer.STR_FUNC_QWORDS) != 0) {
                if (processingEmbedded == LOOKING_FOR_EMBEDDED) { // Only make this change when lexing, not parsing
                    // I want the terminating ")" to be passed as a string closure token,
                    // not as a plain rparen, since I want it to match up with the
                    // string opening tag (and I don't want an unbalanced right paren)
                    lexer.setValue(new Token(""+end, lexer.getPosition()));
                    return Tokens.tSTRING_END;
                }
                
                flags = -1;
                lexer.getPosition();
                return ' ';
            }
            
            if ((flags & Lexer.STR_FUNC_REGEXP) != 0) {
                lexer.setValue(new RegexpNode(src.getPosition(), "", parseRegexpFlags(src)));
                return Tokens.tREGEXP_END;
            }
            
            lexer.setValue(new Token("\"", lexer.getPosition()));
            return Tokens.tSTRING_END;
        }
        
        if (spaceSeen) {
            src.unread(c);
            lexer.getPosition();
            return ' ';
        }

        if ((processingEmbedded == EMBEDDED_DEXPR) && (c == '}')) {
            processingEmbedded = LOOKING_FOR_EMBEDDED;
            lexer.setValue(new Token("}", lexer.getPosition()));
            return Tokens.tSTRING_CONTENT;
        }

        // Single-quote fast path
        if (begin == '\0' && flags == 0) {
            CStringBuilder buffer = new CStringBuilder();
            src.unread(c);
            if (parseSimpleStringIntoBuffer(src, buffer) == Lexer.EOF) {
                throw new SyntaxException(PID.STRING_HITS_EOF, src.getPosition(), "unterminated string meets end of file");
            }

            lexer.setValue(new StrNode(lexer.getPosition(), buffer.toString()));
            return Tokens.tSTRING_CONTENT;
        }
        
        CStringBuilder buffer = new CStringBuilder();

        if ((flags & Lexer.STR_FUNC_EXPAND) != 0 && c == '#') {
            c = src.read();
            switch (c) {
            case '$':
            case '@':
                if (processingEmbedded == LOOKING_FOR_EMBEDDED) processingEmbedded = EMBEDDED_DVAR;
                
                src.unread(c);
                lexer.setValue(new Token("#" + c, lexer.getPosition()));
                return Tokens.tSTRING_DVAR;
            case '{':
                if (processingEmbedded == LOOKING_FOR_EMBEDDED) processingEmbedded = EMBEDDED_DEXPR;
                
                lexer.setValue(new Token("#" + c, lexer.getPosition())); 
                return Tokens.tSTRING_DBEG;
            }
            buffer.append((byte) '#');
        }
        src.unread(c);
        
        int parsed;
        if (processingEmbedded == EMBEDDED_DEXPR) {
            parsed = parseDExprIntoBuffer(lexer, src, buffer);
        } else {
            parsed = parseStringIntoBuffer(lexer, src, buffer);
        }

        if (parsed == Lexer.EOF) {
            // We've read to the end of input and haven't found a corresponding String
            // terminator. However, we don't always want to return the rest of the input as
            // erroneous; in lexing mode, we want to stop at the first newline
            // (at least or normal quoted strings, possibly not for heredocs etc.)
            // and resume parsing from there, since it's likely that we're in the middle
            // of typing a string.
            // We've gotta push the "unused portion" of the string back into the input;
            // the unused portion is the portion after the first newline.
//            int n = buffer.length();
//            for (int j = 0; j < n; j++) {
//                if (buffer.charAt(j) == '\n') {
//                    // Found it.
//                    j++; // Include at least one
//                    for (int k = n-1; k >= j; k--) {
//                        // push input back in reverse order
//                        src.unread(buffer.charAt(k));
//                    }
//                    // Fall through outer loop and throw SyntaxException
//                    break;
//                }
//            }
            //throw new SyntaxException(PID.STRING_HITS_EOF, src.getPosition(), "unterminated string meets end of file");
            throw new UnterminatedStringException(src.getPosition(), "unterminated string meets end of file");
        }

        lexer.setValue(new StrNode(lexer.getPosition(), buffer.toString()));

        // DVARs last only for a single string token so shut if off here.
        if (processingEmbedded == EMBEDDED_DVAR) {
            processingEmbedded = LOOKING_FOR_EMBEDDED;
        } else if ((processingEmbedded == EMBEDDED_DEXPR) && (buffer.length() == 0)) {
            // Unbalanced expression - see NB #96485
            processingEmbedded = LOOKING_FOR_EMBEDDED;
        }

        return Tokens.tSTRING_CONTENT;
    }

    private int parseRegexpFlags(final LexerSource src) throws java.io.IOException {
        char kcode = 0;
        int options = 0;
        int c;
        CStringBuilder unknownFlags = new CStringBuilder(10);

        for (c = src.read(); c != Lexer.EOF
                && Character.isLetter(c); c = src.read()) {
            switch (c) {
            case 'i':
                options |= ReOptions.RE_OPTION_IGNORECASE;
                break;
            case 'x':
                options |= ReOptions.RE_OPTION_EXTENDED;
                break;
            case 'm':
                options |= ReOptions.RE_OPTION_MULTILINE;
                break;
            case 'o':
                options |= ReOptions.RE_OPTION_ONCE;
                break;
            case 'n':
                kcode = 16;
                break;
            case 'e':
                kcode = 32;
                break;
            case 's':
                kcode = 48;
                break;
            case 'u':
                kcode = 64;
                break;
            case 'j':
                options |= 256; // Regexp engine 'java'
                break;
            default:
                unknownFlags.append(c);
                break;
            }
        }
        src.unread(c);
        if (unknownFlags.length() != 0) {
            throw new SyntaxException(PID.REGEXP_UNKNOWN_OPTION, src.getPosition(), "unknown regexp option"
                    + (unknownFlags.length() > 1 ? "s" : "") + " - "
                    + unknownFlags.toString(), unknownFlags.toString());
        }
        return options | kcode;
    }
    
    public int parseSimpleStringIntoBuffer(LexerSource src, CStringBuilder buffer) throws java.io.IOException {
        int c;

        while ((c = src.read()) != Lexer.EOF) {
            if (c == end) {
                src.unread(c);
                break;
            } else if (c == '\\') {
                c = src.read();
                if ((c == '\n' || c != end) && c != '\\') buffer.append('\\');
            } 

            buffer.append((char) c);
        }
        
        return c;
    }
    
    public int parseStringIntoBuffer(Lexer lexer, LexerSource src, CStringBuilder buffer) throws java.io.IOException {
        boolean qwords = (flags & Lexer.STR_FUNC_QWORDS) != 0;
        boolean expand = (flags & Lexer.STR_FUNC_EXPAND) != 0;
        boolean escape = (flags & Lexer.STR_FUNC_ESCAPE) != 0;
        boolean regexp = (flags & Lexer.STR_FUNC_REGEXP) != 0;
        int c;

        while ((c = src.read()) != Lexer.EOF) {
            if (begin != '\0' && c == begin) {
                nest++;
            } else if (processingEmbedded == EMBEDDED_DEXPR && c == '}') {
                src.unread(c);
                break;
            } else if (processingEmbedded == EMBEDDED_DVAR && !((c == '_') || c == '$' || c == '@' || Character.isLetter(c))) {
                 src.unread(c);
                 break;
            } else if (c == end) {
                if (nest == 0) {
                    src.unread(c);
                    break;
                }
                nest--;
            } else if (c == '#' && expand && !src.peek('\n')) {
                int c2 = src.read();

                if (c2 == '$' || c2 == '@' || c2 == '{') {
                    src.unread(c2);
                    src.unread(c);
                    break;
                }
                src.unread(c2);
            } else if (c == '\\') {
                c = src.read();
                switch (c) {
                case '\n':
                    if (qwords) break;
                    if (expand) continue;
                    buffer.append('\\');
                    break;

                case '\\':
                    if (escape) buffer.append((char) c);
                    break;

                default:
                    if (regexp) {
                        src.unread(c);
                        parseEscapeIntoBuffer(src, buffer);
                        continue;
                    } else if (expand) {
                        src.unread(c);
                        if (escape) buffer.append('\\');
                        c = lexer.readEscape();
                    } else if (qwords && Character.isWhitespace(c)) {
                        /* ignore backslashed spaces in %w */
                    } else if (c != end && !(begin != '\0' && c == begin)) {
                        buffer.append('\\');
                    }
                }
            } else if (qwords && Character.isWhitespace(c)) {
                src.unread(c);
                break;
            }
            buffer.append((char) c);
        }
        
        return c;
    }

    public int parseDExprIntoBuffer(Lexer lexer, LexerSource src, CStringBuilder buffer) throws java.io.IOException {
        boolean qwords = (flags & Lexer.STR_FUNC_QWORDS) != 0;
        boolean expand = (flags & Lexer.STR_FUNC_EXPAND) != 0;
        boolean escape = (flags & Lexer.STR_FUNC_ESCAPE) != 0;
        boolean regexp = (flags & Lexer.STR_FUNC_REGEXP) != 0;
        int c;

        while ((c = src.read()) != Lexer.EOF) {
            if (c == '{') {
                nest++;
            } else if (c == '}') {
                if (nest == 0) {
                    src.unread(c);
                    break;
                }
                nest--;
//            } else if (c == end) {
//                if (nest == 0) {
//                    src.unread(c);
//                    break;
//                }
//                nest--;
            } else if (c == '\\') {
                c = src.read();
                switch (c) {
                case '\n':
                    if (qwords) break;
                    if (expand) continue;
                    buffer.append('\\');
                    break;

                case '\\':
                    if (escape) buffer.append((char) c);
                    break;

                default:
                    if (regexp) {
                        src.unread(c);
                        parseEscapeIntoBuffer(src, buffer);
                        continue;
                    } else if (expand) {
                        src.unread(c);
                        if (escape) buffer.append('\\');
                        c = lexer.readEscape();
                    } else if (qwords && Character.isWhitespace(c)) {
                        /* ignore backslashed spaces in %w */
                    } else if (c != end && !(begin != '\0' && c == begin)) {
                        buffer.append('\\');
                    }
                }
            } else if (qwords && Character.isWhitespace(c)) {
                src.unread(c);
                break;
            }
            buffer.append((char) c);
        }

        return c;
    }

    public boolean isSubstituting() {
        return (flags & Lexer.STR_FUNC_EXPAND) != 0;
    }

    // Was a goto in original ruby lexer
    private void escaped(LexerSource src, CStringBuilder buffer) throws java.io.IOException {
        int c;

        switch (c = src.read()) {
        case '\\':
            parseEscapeIntoBuffer(src, buffer);
            break;
        case Lexer.EOF:
            throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
        default:
            buffer.append((char) c);
        }
    }

    private void parseEscapeIntoBuffer(LexerSource src, CStringBuilder buffer) throws java.io.IOException {
        int c;

        switch (c = src.read()) {
        case '\n':
            break; /* just ignore */
        case '0':
        case '1':
        case '2':
        case '3': /* octal constant */
        case '4':
        case '5':
        case '6':
        case '7':
            buffer.append('\\');
            buffer.append((char) c);
            for (int i = 0; i < 2; i++) {
                c = src.read();
                if (c == Lexer.EOF) {
                    throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
                }
                if (!Lexer.isOctChar(c)) {
                    src.unread(c);
                    break;
                }
                buffer.append((char) c);
            }
            break;
        case 'x': /* hex constant */
            buffer.append('\\');
            buffer.append((char) c);
            c = src.read();
            if (!Lexer.isHexChar(c)) {
                throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
            }
            buffer.append((char) c);
            c = src.read();
            if (Lexer.isHexChar(c)) {
                buffer.append((char) c);
            } else {
                src.unread(c);
            }
            break;
        case 'M':
            if ((c = src.read()) != '-') {
                throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
            }
            buffer.append(new byte[] { '\\', 'M', '-' });
            escaped(src, buffer);
            break;
        case 'C':
            if ((c = src.read()) != '-') {
                throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
            }
            buffer.append(new byte[] { '\\', 'C', '-' });
            escaped(src, buffer);
            break;
        case 'c':
            buffer.append(new byte[] { '\\', 'c' });
            escaped(src, buffer);
            break;
        case Lexer.EOF:
            throw new SyntaxException(PID.INVALID_ESCAPE_SYNTAX, src.getPosition(), "Invalid escape character syntax");
        default:
            if (c != '\\' || c != end) {
                buffer.append('\\');
            }
            buffer.append((char) c);
        }
    }

    public Object getMutableState() {
        return new MutableTermState(processingEmbedded, nest);
    }

    public void setMutableState(Object o) {
        MutableTermState state = (MutableTermState)o;
        if (state != null) {
            this.processingEmbedded = state.processingEmbedded;
            this.nest = state.nest;
        }
    }

    public void splitEmbeddedTokens() {
        if (processingEmbedded == IGNORE_EMBEDDED) processingEmbedded = LOOKING_FOR_EMBEDDED;
    }

    private class MutableTermState {
        private MutableTermState(int embeddedCode, int nest) {
            this.processingEmbedded = embeddedCode;
            this.nest = nest;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) return false;

            final MutableTermState other = (MutableTermState) obj;

            if (this.nest != other.nest) return false;

            return this.processingEmbedded == other.processingEmbedded;
        }

        @Override
        public int hashCode() {
            int hash = 7;

            hash = 83 * hash + this.nest;
            hash = 83 * hash + this.processingEmbedded;
            return hash;
        }

        @Override
        public String toString() {
            return "StringTermState[nest=" + nest + ",embed=" + processingEmbedded + "]";
        }

        private int nest;
        private int processingEmbedded;
    }

    // Equals - primarily for unit testing (incremental lexing tests
    // where we do full-file-lexing and compare state to incremental lexing)
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        final StringTerm other = (StringTerm) obj;

        return this.flags == other.flags && this.end == other.end && this.begin == other.begin &&
            this.processingEmbedded == other.processingEmbedded && this.nest == other.nest;
    }

    private static String toFuncString(int flags) {
        CStringBuilder builder = new CStringBuilder();
        
        if ((flags & Lexer.STR_FUNC_ESCAPE) != 0) builder.append("escape|");
        if ((flags & Lexer.STR_FUNC_EXPAND) != 0) builder.append("expand|");
        if ((flags & Lexer.STR_FUNC_REGEXP) != 0) builder.append("regexp|");
        if ((flags & Lexer.STR_FUNC_QWORDS) != 0) builder.append("qwords|");
        if ((flags & Lexer.STR_FUNC_SYMBOL) != 0) builder.append("symbol|");
        if ((flags & Lexer.STR_FUNC_INDENT) != 0) builder.append("indent|");

        String string = builder.toString();

        if (string.endsWith("|")) string = string.substring(0, string.length()-1);
        if (string.length() == 0) string = "-";

        return string;
    }

    @Override
    public String toString() {
        return "StringTerm[flags=" + toFuncString(flags) + ",end=" + end + ",begin=" + (int)begin +
                ",nest=" + nest + ",embed=" + processingEmbedded + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = 13 * hash + this.flags;
        hash = 13 * hash + this.end;
        hash = 13 * hash + this.begin;
        hash = 13 * hash + this.nest;
        hash = 13 * hash + this.processingEmbedded;
        return hash;
    }

    public static class UnterminatedStringException extends SyntaxException {
        public UnterminatedStringException(SourcePosition pos, String message) {
            // TODO - get rid of this class now that I have an id? I can switch on normal SyntaxExceptions!
            super(PID.STRING_HITS_EOF, pos, message);
        }
    }
}
