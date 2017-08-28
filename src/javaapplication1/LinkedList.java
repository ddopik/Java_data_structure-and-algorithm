package javaapplication1;

/**
 *
 * @author dell
 */
public class LinkedList {

    private LinkedListNode head;
    private int listCount;

    public LinkedList() {

        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        this.head = new LinkedListNode(null);
        this.listCount = 0;
    }

    // post: appends the specified element to the end of this list.
    public void append(Object _data) {

        LinkedListNode temp = new LinkedListNode(_data);
        LinkedListNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // the last node's "next" reference set to our new node
        current.setNext(temp);
        this.listCount++;
    }

    public void insetIn(int position, Object data) {
        LinkedListNode current = head;
        LinkedListNode temp = new LinkedListNode(data);
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 1; i < position && current.getNext() != null; i++) {
            current = current.getNext();
        }

        //set my new node referance to the previous node
        current.setNext(temp);
        //get what was the next node of current and intializing it to the new node
        temp.setNext(current.getNext());
    }

    public Object getNode(int position) // post: returns the element at the specified position in this list.
    {
        if (position <= 0) {
            return null;
        }
        LinkedListNode current = head;
        for (int i = 1; i < position && current.getNext() != null; i++) {
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }

        return current;

    }

    public boolean remove(int position) // post: removes the element at the specified position in this list.
    {
        if (position > 1 && position < this.listCount) {
            return false;
        }

        LinkedListNode current = head;
        for (int i = 1; i < position; i++) { //3
            if (current.getNext() != null) {
                return false;
            }           
            current = current.getNext();  ///final round the loops stop at (position -1)
        }

        
        current.setNext(current.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }
    public void  deleteFirst()
    {
       if (head != null)
           head=head.getNext();
            
    }

}
