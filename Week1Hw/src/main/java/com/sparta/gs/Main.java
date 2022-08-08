package com.sparta.gs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        PalindromeChecker stringy = new PalindromeChecker();
//
//        String isNotAPalindrome = "Hello";
//        String isPalindromeTrue = "racecar";
//        System.out.println(stringy.reverse(isNotAPalindrome));
//        System.out.println(stringy.isPalindrome(isNotAPalindrome));
//        System.out.println(stringy.reverse(isPalindromeTrue));
//        System.out.println(stringy.isPalindrome(isPalindromeTrue));
//
//        MergeArray merge1 = new MergeArray();
//        System.out.println(merge1.mergeArray(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}));

        BubbleSort sort = new BubbleSort();

        System.out.println(Arrays.toString(sort.bubbleSort(new int[]{11, 9, 15, 1, 2, 6})));

        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] arr2 = {0, 2, 4, 6, 8, 10, 12, 14};

        System.out.println(Arrays.toString(MergeArray.mergeArraySorter(arr1, arr2)));


    }
}
