package javaapplication1;

public class Node {

    // reference to the next node in the chain,
    // or null if there isn't one.
    Node next;
    // data carried by this node.
    // could be of any type you need.
    Object data;

    public Node(Object _data) {
        this.next = null;
        this.data = _data;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public Node(Object _data, Node _next) {
        this.next = _next;
        this.data = _data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object _data) {
        data = _data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node _next) {
        next = _next;
    }
}
