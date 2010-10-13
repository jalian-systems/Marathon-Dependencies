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
 * Copyright (C) 2009 Thomas E. Enebo <tom.enebo@gmail.com>
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
package org.jrubyparser.ast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jrubyparser.NodeVisitor;
import org.jrubyparser.ISourcePositionHolder;
import org.jrubyparser.SourcePosition;

/**
 * Base class for all Nodes in the AST
 */
public abstract class Node implements ISourcePositionHolder {    
    // We define an actual list to get around bug in java integration (1387115)
    static final List<Node> EMPTY_LIST = new ArrayList<Node>();
    public static final List<CommentNode> EMPTY_COMMENT_LIST = new ArrayList<CommentNode>();
    
    private SourcePosition position;

    public Node(SourcePosition position) {
        assert position != null;
        this.position = position;
    }

    /**
     * Location of this node within the source
     */
    public SourcePosition getPosition() {
        return position;
    }

    public void setPosition(SourcePosition position) {
        this.position = position;
    }
    
    public abstract Object accept(NodeVisitor visitor);
    public abstract List<Node> childNodes();

    protected static List<Node> createList(Node... nodes) {
        ArrayList<Node> list = new ArrayList<Node>();
        
        for (Node node: nodes) {
            if (node != null) list.add(node);
        }
        
        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(60);

        builder.append("(").append(getNodeName());

        if (this instanceof INameNode) {
            builder.append(":").append(((INameNode) this).getName());
        }
        
        for (Node child: childNodes()) {
            builder.append(", ").append(child);
        }
        builder.append(")");

        return builder.toString();
    }

    protected String getNodeName() {
        String name = getClass().getName();
        int i = name.lastIndexOf('.');
        String nodeType = name.substring(i + 1);
        return nodeType;
    }
    
    public void addComment(CommentNode comment) {
        Collection<CommentNode> comments = position.getComments();
        if (comments == null) {
            comments = new ArrayList<CommentNode>();
            position.setComments(comments);
        }

        comments.add(comment);
    }
    
    public void addComments(Collection<CommentNode> moreComments) {
        Collection<CommentNode> comments = position.getComments();
        if (comments == EMPTY_COMMENT_LIST) {
            comments = new ArrayList<CommentNode>();
            position.setComments(comments);
        }

        comments.addAll(moreComments);
    }
    
    public Collection<CommentNode> getComments() {
        return position.getComments();
    }
    
    public boolean hasComments() {
        return getComments() != EMPTY_COMMENT_LIST;
    }
    
    public SourcePosition getPositionIncludingComments() {
        if (!hasComments()) return position;
        
        String fileName = position.getFile();
        int startOffset = position.getStartOffset();
        int endOffset = position.getEndOffset();
        int startLine = position.getStartLine();
        int endLine = position.getEndLine();
        
        // Since this is only used for IDEs this is safe code, but there is an obvious abstraction issue here.
        SourcePosition commentIncludingPos = 
            new SourcePosition(fileName, startLine, endLine, startOffset, endOffset);
        
        for (CommentNode comment: getComments()) {
            commentIncludingPos = 
                SourcePosition.combinePosition(commentIncludingPos, comment.getPosition());
        }       

        return commentIncludingPos;
    }

    /**
     * Is the current node something that is syntactically visible in the AST.  IDE consumers
     * should ignore these elements.
     */
    public boolean isInvisible() {
        return this instanceof InvisibleNode;
    }

    /**
     * @return the nodeId
     */
    public abstract NodeType getNodeType();
}
