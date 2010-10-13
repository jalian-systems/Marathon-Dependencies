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

import java.util.List;

import org.jrubyparser.NodeVisitor;
import org.jrubyparser.SourcePosition;

/**
 * Represents the argument declarations of a method.  The fields:
 * foo(p1, ..., pn, o1 = v1, ..., on = v2, *r, q1, ..., qn)
 *
 * p1...pn = pre arguments
 * o1...on = optional arguments
 * r       = rest argument
 * q1...qn = post arguments (only in 1.9)
 */
public class ArgsNode extends Node {
    private ListNode pre;
    private ListNode optional;
    private ListNode post; // Only in ruby 1.9 methods
    protected ArgumentNode rest;
    private BlockArgNode block;
    
    /**
     * @param position of the arguments
     * @param pre Required nodes at the beginning of the method definition
     * @param optional Node describing the optional arguments
     * @param rest The rest argument (*args).
     * @param post Required nodes at the end of the method definition
     * @param block An optional block argument (&amp;arg).
     **/
    public ArgsNode(SourcePosition position, ListNode pre, ListNode optional, RestArgNode rest,
            ListNode post, BlockArgNode block) {
        super(position);

        this.pre = pre;
        this.optional = optional;
        this.post = post;
        this.rest = rest;
        this.block = block;
    }

    public NodeType getNodeType() {
        return NodeType.ARGSNODE;
    }
    
    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public Object accept(NodeVisitor iVisitor) {
        return iVisitor.visitArgsNode(this);
    }

    public int getPreCount() {
        return pre == null ? 0 : pre.size();
    }

    public int getOptionalCount() {
        return optional == null ? 0 : optional.size();
    }

    public int getPostCount() {
        return post == null ? 0 : post.size();
    }

    public int getRequiredCount() {
        return getPreCount() + getPostCount();
    }

    public int getMaxArgumentsCount() {
        return getRequiredCount() + getOptionalCount();
    }

    /**
     * Gets the optional Arguments.
     * 
     * @return Returns a ListNode
     */
    public ListNode getOptional() {
        return optional;
    }

    public ListNode getPost() {
        return post;
    }

    /**
     * Gets the required arguments at the beginning of the argument definition
     */
    public ListNode getPre() {
        return pre;
    }

    /**
     * Gets the rest node.
     * 
     * @return Returns an ArgumentNode
     */
    public ArgumentNode getRest() {
        return rest;
    }

    /**
     * Gets the explicit block argument of the parameter list (&block).
     * 
     * @return Returns a BlockArgNode
     */
    public BlockArgNode getBlock() {
        return block;
    }

    public List<Node> childNodes() {
        if (post != null) return Node.createList(pre, optional, rest, post, block);

        return Node.createList(pre, optional, rest, block);
    }
}
