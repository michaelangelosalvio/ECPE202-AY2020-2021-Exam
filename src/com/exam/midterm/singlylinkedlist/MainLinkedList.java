package com.exam.midterm.singlylinkedlist;

public class MainLinkedList {

    public static void main(String[] args) {

        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insert(three);
        list.printList();
        list.insert(two);
        list.printList();
        list.insert(one);
        list.printList();
        list.insert(four);
        list.printList();
    }
}
