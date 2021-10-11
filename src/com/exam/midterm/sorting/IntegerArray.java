package com.exam.midterm.sorting;

/**
 *  Note: You are not allowed to modify any of the codes below
 */

public class IntegerArray {
    private int array[] = {20,35,-15,7,55,1,-22};

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
