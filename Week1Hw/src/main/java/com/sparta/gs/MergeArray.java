package com.sparta.gs;

public class MergeArray {
    public static int[] mergeArray(int[] arr1, int[] arr2) {
//        int[] arr1 = {1,3,5,7};
//        int[] arr2 = {2,4,6,8,9,10};
        int[] arr3 = new int[arr1.length + arr2.length];

        int arr1And2Length = arr1.length + arr2.length;
        System.out.println(arr1And2Length);

        int countArr1 = 0;
        int countArr2 = 0;
//        int countMergeArray;

        for (int a = 0; a < arr1And2Length; a ++) {
            for (int b = 0; b < arr1.length -1 && b < arr2.length -1 ; b++) {
                if (arr1[b] < arr2[b]) {
                    arr3[b] = arr1[b];
                    countArr1++;
                } else if (arr1[b] > arr2[b]) {
                    arr3[b] = arr2[b];
                    countArr2++;
                }
            }
        }
        return arr3;
    }
}
