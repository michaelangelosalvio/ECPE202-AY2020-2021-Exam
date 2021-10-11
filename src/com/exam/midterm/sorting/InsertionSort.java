package com.exam.midterm.sorting;

/**
 * Name :
 * Course :
 * Description: Sorting Algorithm
 */

public class InsertionSort {
    public static void main(String[] args ) {

        //provide your own values

        /**
         * This will test out the method you created
         */

        IntegerArray arrayForInsertion = new IntegerArray();

        System.out.println("Insertion Sort in Ascending: " );
        insertionSort(arrayForInsertion);
        arrayForInsertion.printArray();

        System.out.println("-".repeat(20));

        IntegerArray arrayForBubbleSort = new IntegerArray();

        System.out.println("Bubble Sort in Ascending: " );
        bubbleSort(arrayForBubbleSort);
        arrayForBubbleSort.printArray();

    }


    /**
     *
     * @param array - The array class to be sorted using insertion sort algroithm
     *
     * Note: Print the values of the array at every iteration
     *
     */
    public static void insertionSort(IntegerArray array) {


    }

    /**
     *
     * @param array - The array class to be sorted using bubble sort algroithm
     *
     * Note: Print the values of the array at every iteration
     *
     */
    public static void bubbleSort(IntegerArray array) {


    }



}
