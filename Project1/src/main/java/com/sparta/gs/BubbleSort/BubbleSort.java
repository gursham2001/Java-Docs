package com.sparta.gs.BubbleSort;

import java.util.Arrays;

public class BubbleSort {



    static int[] bubbleSort(int[] arrayToSort) {
        // this code loops over all ages elements
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            // we then ask oneIteration to sort the ages in order
            arrayToSort = oneIterationSort.oneIteration(arrayToSort);
        }
        System.out.println("Values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
