package com.sparta.gs.sortAlgorithms;

import java.util.logging.Logger;

public class MergeSort implements Sorter {
    private static Logger logger = Logger.getLogger("my Logger");
    @Override
    public int[] SortArray(int[] arrays) {
        mergeSort(arrays, arrays.length);
        return arrays;
    }
    public static void mergeSort(int[] a, int number) {
        // if n is 1
        if (number < 2) {
            logger.info("If array is smaller the number");
            return;
        }
        int midPoint = number / 2;
        int[] l = new int[midPoint];
        int[] r = new int[number - midPoint];

        logger.info("For loop begins - For loop for assigning left array elements");
        for (int i = 0; i < midPoint; i++) {
            logger.info("puts all elements until we reach midpoint to left array");
            l[i] = a[i];
        }
        logger.info("For loop for assigning right array elements");
        for (int i = midPoint; i < number; i++) {
            logger.info("puts all elements from midpoint to end");
            r[i - midPoint] = a[i];
        }
        mergeSort(l, midPoint);
        mergeSort(r, number - midPoint);
        merge(a, l, r, midPoint, number - midPoint);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        logger.info("while loop to sort begins");
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        logger.info("counter for left starts");
        while (i < left) {
            a[k++] = l[i++];
        }
        logger.info("counter for right starts");
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    // we to string it to be able to display it in the display manager as The sort name
    @Override
    public String toString() {
        return "MergeSort";
    }
}
