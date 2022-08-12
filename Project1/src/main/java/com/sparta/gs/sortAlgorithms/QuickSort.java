package com.sparta.gs.sortAlgorithms;

import java.util.logging.Logger;

public class QuickSort implements Sorter{

    private static Logger logger = Logger.getLogger("my Logger");
    public int[] quickSort(int[] arr, int begin, int end) {
        logger.info("if statement to make sure the first num is smaller than the last");
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        logger.info("return arr");
        return arr;
    }
    private int partition(int arr[], int begin, int end) {
        logger.info("array partition started");
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            logger.info("For loop begins");
            if (arr[j] <= pivot) {
                i++;
                logger.info("If statement to check if arr[j] is smaller or equals to pivot");
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        logger.info("return i + 1");
        return i+1;
    }
    @Override
    public int[] SortArray(int[] arrays) {
        return quickSort(arrays, 0, arrays.length -1);
    }
    @Override
    public String toString() {
        return "QuickSort";
    }
}
