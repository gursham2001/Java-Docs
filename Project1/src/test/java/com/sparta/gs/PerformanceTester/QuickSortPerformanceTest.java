package com.sparta.gs.PerformanceTester;

import com.sparta.gs.sortAlgorithms.MergeSort;
import com.sparta.gs.sortAlgorithms.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static com.sparta.gs.Display.DisplayManager.resultsPrinted;

public class QuickSortPerformanceTest {
    private int[] unsortedArray;
    private static int[] arrayToSort;
    @BeforeAll
    public static void classSetup() {
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayToSort[i] = random.nextInt(1000)+1;
        }
    }
    @BeforeEach
    public void setup() {
        unsortedArray = arrayToSort.clone();
    }
    @Test
    public void testQuickSorter() {
        System.out.println("Array Before\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.SortArray(unsortedArray);
        long end = System.nanoTime();
        resultsPrinted(sorter, sortedArray);
    }
}
