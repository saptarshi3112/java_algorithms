package main.linked_list;

public class LinkedList {

    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public ListNode getHead () {
        return head;
    }

    public void setHead (ListNode head) {
        this.head = head;
    }

    public void push (int val) {
        ListNode newNode = new ListNode(val);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void append (int val) {

        ListNode newNode = new ListNode(val);

        if (this.head == null) {
            newNode.setNext(null);
            this.head = newNode;
            return;
        }

        ListNode last = this.head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        newNode.setNext(last.getNext());
        last.setNext(newNode);

    }

    public void printList () {
        ListNode n = this.head;
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }
    }

}
