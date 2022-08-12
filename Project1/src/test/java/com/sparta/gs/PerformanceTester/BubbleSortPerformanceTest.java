package com.sparta.gs.PerformanceTester;

import com.sparta.gs.sortAlgorithms.BubbleSort;
import com.sparta.gs.sortAlgorithms.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static com.sparta.gs.Display.DisplayManager.resultsPrinted;

public class BubbleSortPerformanceTest {

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
    public void testBubbleSorter() {
        System.out.println("Array Before\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.SortArray(unsortedArray);
        long end = System.nanoTime();
        resultsPrinted(sorter, sortedArray);
    }
}
