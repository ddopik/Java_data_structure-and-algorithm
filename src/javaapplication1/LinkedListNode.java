/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ddopik
 */
public class LinkedListNode {
      // reference to the next node in the chain,
    // or null if there isn't one.
    LinkedListNode next;
    // data carried by this node.
    // could be of any type you need.
    Object data;

    public LinkedListNode(Object _data) {
        this.next = null;
        this.data = _data;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public LinkedListNode(Object _data, LinkedListNode _next) {
        this.next = _next;
        this.data = _data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object _data) {
        data = _data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode _next) {
        next = _next;
    }
}
