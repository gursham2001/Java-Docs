package com.sparta.gs.sortAlgorithms;

import java.util.Arrays;
import java.util.logging.Logger;

public class BubbleSort implements Sorter{

//    private static Logger logger = Logger.getLogger("my Logger");
//    private static CustomHandler customHandler = new CustomHandler();
    @Override
    public int[] SortArray(int[] arrays) {
//        logger.info("Calls the method below to execute the Bubble Sort");
        return BubbleSort(arrays);
    }
    public static int[] BubbleSort(int[] search){
//        logger.info("Sorting has begun");
        int temp;
        for (int i = 0; i < search.length; i++) {
//            logger.info("first loop has begun");
            for ( int elememt = 0; elememt < search.length - 1; elememt++){
//                logger.info("second loop has begun");
                if (search[elememt] > search[elememt + 1]){
//                    logger.info("elements are being swapped if condition is met");
                    temp = search[elememt];
                    search[elememt] = search[elememt + 1];
                    search[elememt + 1] = temp;
                }
            }
        }
//        logger.info("returns the array search");
        return search;
    }
    @Override
    public String toString() {return "BubbleSort";}
}
