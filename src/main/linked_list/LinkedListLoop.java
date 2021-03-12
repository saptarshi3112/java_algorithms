package main.linked_list;

public class LinkedListLoop {

    public boolean solution (LinkedList list) {
        ListNode slow = list.getHead();
        ListNode fast = list.getHead();

        while (slow != null && fast != null && fast.getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                return true;
            }

        }

        return false;

    }

}
