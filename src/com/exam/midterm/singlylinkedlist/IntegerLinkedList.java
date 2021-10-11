package com.exam.midterm.singlylinkedlist;

/**
 * Name :
 * Course :
 * Description: Linked List
 */

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    /**
     *  - Modify the method such that the value is inserted in sorted order
     *  - Lower values should appear first int he list (closer to the head)
     *  - If we insert 4,2,1,5, list should look like HEAD -> 1 -> 2 -> 4 -> 5 -> null
     * @param value
     */


    public void insert(int value) {

        // add your code here

    }

    /**
     *  Note: You are not allowed to modify any of the codes below
     */

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
