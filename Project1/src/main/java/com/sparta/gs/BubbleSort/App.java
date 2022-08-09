package com.sparta.gs.BubbleSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        System.out.println(Arrays.toString(sort.bubbleSort(new int[]{11, 9, 15, 1, 2, 6})));
    }
}
