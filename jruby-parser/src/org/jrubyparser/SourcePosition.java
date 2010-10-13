/*
 ***** BEGIN LICENSE BLOCK *****
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
 * Copyright (C) 2009 Thomas E Enebo <tom.enebo@gmail.com>
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
package org.jrubyparser;

import java.io.Serializable;
import java.util.Collection;

import org.jrubyparser.ast.CommentNode;
import org.jrubyparser.ast.Node;

/**
 * Position within a source.
 */
public class SourcePosition implements Serializable {
    private static final long serialVersionUID = 3762529027281400377L;
    
    // The file of the source
    private final String file;
    
    // The state/end rows of the source
    private final int startLine;
    private final int endLine;
    
    // The start/end offsets of the source
    private int startOffset;
    private final int endOffset;
    
    private Collection<CommentNode> comments = Node.EMPTY_COMMENT_LIST;

    /**
     * Creates a default source position - required for serialization.
     */
    public SourcePosition() {
    	this("", 0, 0);
    }
    
    /**
     * Creates a new source position.
     * 
     * @param file location of the source (must not be null)
     * @param endLine what line within the source
     */
	public SourcePosition(String file, int startLine, int endLine) {
		if (file == null) { //otherwise equals() and getInstance() will fail
			throw new NullPointerException();  
		}
		this.file = file;
		this.startLine = startLine;
		this.endLine = endLine;
		this.startOffset = 0;
		this.endOffset = 0;
	}

    /**
     * Creates a new source position.
     * 
     * @param file location of the source (must not be null)
     * @param line what line within the source
     */
	public SourcePosition(String file, int startLine, int endLine, int startOffset, int endOffset) {
		if (file == null) { //otherwise equals() and getInstance() will fail
			throw new NullPointerException();  
		}
		this.file = file;
		this.startLine = startLine;
		this.endLine = endLine;
		this.startOffset = startOffset;
		this.endOffset = endOffset;
	}

    public String getFile() {
        return file;
    }
    
    public int getStartLine() {
    	return startLine;
    }

    public int getEndLine() {
        return endLine;
    }

    /**
     * @param object the object which should be compared
     * @return simple Object.equals() implementation
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (!(object instanceof SourcePosition)) return false;
        
        SourcePosition other = (SourcePosition) object;

        return file.equals(other.file) && endLine == other.endLine;
    }

    /**
     * Something we can use for identity in hashing, etc...
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return file.hashCode() ^ endLine;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return file + ":[" + startLine + "," + endLine + "]:[" + 
            getStartOffset() + "," + getEndOffset() + "]";
    }
    
    public void adjustStartOffset(int relativeValue) {
        startOffset += relativeValue;
        if(startOffset < 0) startOffset = 0;
    }
    
    public int getStartOffset() {
    	return startOffset;
    }
    
    public int getEndOffset() {
    	return endOffset;
    }
    
    public SourcePosition union(SourcePosition other) {
        return new SourcePosition(file, startLine, other.getEndLine(), startOffset, other.getEndOffset());
    }
    
    /**
     * Not used in interpreter 
     * Creates a new position the encloses both parameter positions.
     * 
     * @param the positions providing the boundaries for the new position.
     */
    public static SourcePosition combinePosition(SourcePosition firstPos, SourcePosition secondPos){
        String fileName = firstPos.getFile();
        int startOffset = firstPos.getStartOffset();
        int endOffset = firstPos.getEndOffset();
        int startLine = firstPos.getStartLine();
        int endLine = firstPos.getEndLine();
        
        if(startOffset > secondPos.getStartOffset()){
            startOffset = secondPos.getStartOffset();
            startLine = secondPos.getStartLine();
        }
        
        if(endOffset < secondPos.getEndOffset()){
            endOffset = secondPos.getEndOffset();
            endLine = secondPos.getEndLine();
        }
        
        SourcePosition combinedPosition = new SourcePosition(fileName, startLine, endLine, startOffset, endOffset);
        
        return combinedPosition;             
    }

    public Collection<CommentNode> getComments() {
        return comments;
    }

    public void setComments(Collection<CommentNode> comments) {
        this.comments = comments;
    }

    /** For nodes which are added to the AST which are not proper syntactical elements. */
    public static final SourcePosition INVALID_POSITION = new SourcePosition() {
        @Override
        public String getFile() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getStartLine() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getEndLine() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void adjustStartOffset(int relativeValue) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getStartOffset() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getEndOffset() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public SourcePosition union(SourcePosition position) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Collection<CommentNode> getComments() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void setComments(Collection<CommentNode> comments) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
}
