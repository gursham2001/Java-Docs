package com.sparta.gs.Display;

import com.sparta.gs.sortAlgorithms.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
    public static ArrayList<String> getMenuItems() {
        return new ArrayList<>(Arrays.asList(
                "BubbleSorter",
                "BinarySorter",
                "MergeSorter",
                "QuickSorter"
        ));
    }
    public static void printBeforeSort(Sorter sorter, int[] arrayToSort) {
        System.out.println("Sorting using the " + sorter.toString());
        System.out.println("Before sorting:\n" + Arrays.toString(arrayToSort));
    }
    public static void printResults(Sorter sorter, int[] arrayToSort) {
        long start = System.nanoTime();
        int[] sortedArray = sorter.SortArray(arrayToSort);
        System.out.println("After sorting:\n" + Arrays.toString(sortedArray));
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end-start) + " nanoseconds");
    }
    public static void displaySortChoice() {
        System.out.println("Enter the number of the sorter you wish to use" );
        for(int i = 0; i < getMenuItems().size(); i++) {
            System.out.println(i + 1 + ". " + getMenuItems().get(i));
        }

    }
}
