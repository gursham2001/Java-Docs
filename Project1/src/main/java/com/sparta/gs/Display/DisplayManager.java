package com.sparta.gs.Display;

import com.sparta.gs.sortAlgorithms.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
    public static ArrayList<String> getMenuItems() {
        return new ArrayList<>(Arrays.asList(
                "BubbleSorter",
                "BinarySorterAsc",
                "MergeSorter",
                "QuickSorter"
        ));
    }
    public static void initialArray(Sorter sorter, int[] arrayToSort) {
        System.out.println( "Sort will begin with " + sorter.toString());
        System.out.println("Initial Array before sort\n" + Arrays.toString(arrayToSort));
    }
    public static void resultsPrinted(Sorter sorter, int[] arrayToSort) {
        long startTime = System.nanoTime();
        int[] sortedArray = sorter.SortArray(arrayToSort);
        System.out.println("Array after its been sorted\n" + Arrays.toString(sortedArray));
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime-startTime) + " nanoseconds to complete this sort");
    }
    public static void displayChoice() {
        System.out.println("Enter the array size you wish to have" );
        for(int i = 0; i < getMenuItems().size(); i++) {
            System.out.println(i + 1 + ". " + getMenuItems().get(i));
        }
    }
}
