package com.exam.midterm.singlylinkedlist;

/**
 *  Note: You are not allowed to modify any of the codes below
 */

public class IntegerNode {

    private int value;
    private IntegerNode next;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(value);
    }

}
