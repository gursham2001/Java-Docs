package com.sparta.gs.sortAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static int[] oneIteration(int[] arrayToSearch) {
        int tempo = 0;
        for (int i = 0; i < arrayToSearch.length - 1; i++) {
            if (arrayToSearch[i] > arrayToSearch[i + 1]) {
                tempo = arrayToSearch[i];
                arrayToSearch[i] = arrayToSearch[i + 1];
                arrayToSearch[i + 1] = tempo;
            }
        }
        System.out.println("Values are " + Arrays.toString(arrayToSearch));
        return arrayToSearch;
    }
    public static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length - 1; i++) {

            arrayToSort = oneIteration(arrayToSort);
        }
        System.out.println("Values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
