package com.sparta.gs.start;

import com.sparta.gs.Exceptions.SorterLoaderException;
import com.sparta.gs.sortAlgorithms.*;

public class SortFactory {
        public static Sorter getSorter(int choice) throws SorterLoaderException {
            switch (choice) {
                case 1:
                    return new BubbleSort();
                case 2:
                    return new BinarySortAsc();
                case 3:
                    return new MergeSort();
                case 4:
                    return new QuickSort();
                default:
                    throw new SorterLoaderException();
            }
        }
}
