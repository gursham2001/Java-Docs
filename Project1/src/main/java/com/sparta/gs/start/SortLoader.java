package com.sparta.gs.start;

import com.sparta.gs.Display.DisplayManager;
import com.sparta.gs.Exceptions.SorterLoaderException;
import com.sparta.gs.sortAlgorithms.Sorter;
import com.sparta.gs.util.getRandomArray;

import java.util.Scanner;

public class SortLoader {
    private final static Scanner scanner = new Scanner(System.in);
    public static void start() {
        try {
            DisplayManager.displayChoice();
            int choice = scanner.nextInt();
            Sorter sorter = SortFactory.getSorter(choice);
            System.out.println("Please enter the size of array you want to generate: ");
            int[] arrayToSort = getRandomArray.randArray(scanner.nextInt());
            DisplayManager.initialArray(sorter, arrayToSort);
            DisplayManager.resultsPrinted(sorter, arrayToSort);
        } catch (SorterLoaderException e) {
            start();
        }
    }
}
