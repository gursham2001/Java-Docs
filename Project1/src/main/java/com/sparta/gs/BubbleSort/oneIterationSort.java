package com.sparta.gs.BubbleSort;

import java.util.Arrays;

public class oneIterationSort {

    public static int[] oneIteration(int[] arrayToSearch) {
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
}
