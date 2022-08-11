package com.sparta.gs.start;

import com.sparta.gs.Display.DisplayManager;
import com.sparta.gs.Exceptions.ChildNotFoundException;
import com.sparta.gs.Exceptions.SorterLoaderException;
import com.sparta.gs.sortAlgorithms.BinaryTree.BinaryTree;
import com.sparta.gs.sortAlgorithms.BubbleSort;
import com.sparta.gs.sortAlgorithms.MergeSort;
import com.sparta.gs.sortAlgorithms.QuickSort;
import com.sparta.gs.sortAlgorithms.Sorter;
import com.sparta.gs.util.getRandomArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortLoader {
    private final static Scanner scanner = new Scanner(System.in);
    public static void start() {
        try {
            DisplayManager.displaySortChoice();
            int choice = scanner.nextInt();
            Sorter sorter = SortFactory.getSorter(choice);
            System.out.println("Please enter the size of array you want to generate: ");
            int[] arrayToSort = getRandomArray.randArray(scanner.nextInt());
            DisplayManager.printBeforeSort(sorter, arrayToSort);
            DisplayManager.printResults(sorter, arrayToSort);
        } catch (SorterLoaderException e) {
            start();
        }
    }
}
