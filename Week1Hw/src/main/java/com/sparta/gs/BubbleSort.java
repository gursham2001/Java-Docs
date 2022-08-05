package com.sparta.gs;

import java.util.Arrays;

public class BubbleSort {
    static int[] oneIteration(int[] arrayToSearch) {
        // biggest is a variable to store the biggest value
//        int biggest= 0;
        // temp value to store
        int tempo = 0;
        // for loop to find the biggest
        for (int i = 0; i < arrayToSearch.length - 1; i++) {
            // if statement to check if the current value is bigger than the next value
            if (arrayToSearch[i] > arrayToSearch[i + 1]) {
                // if so we store current value in tempo
                tempo = arrayToSearch[i];
                // make the value after the current value
                arrayToSearch[i] = arrayToSearch[i + 1];
                // then assign the next value to the value stored in temp
                arrayToSearch[i + 1] = tempo;
            }
        }
        System.out.println("Values are " + Arrays.toString(arrayToSearch));
        // we return the whole array which is sorted
        return arrayToSearch;
    }

    static int[] bubbleSort(int[] arrayToSort) {
        // this code loops over all ages elements
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            // we then ask oneIteration to sort the ages in order
            arrayToSort = oneIteration(arrayToSort);
        }
        System.out.println("Values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
