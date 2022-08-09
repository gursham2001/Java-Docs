package com.sparta.gs.MergeSort;

import static com.sparta.gs.MergeSort.Merge.merge;

// takes in input array and length
// base condition checks if length is 1 and it will just return
// for the other conditions recursive calls will be returned

public class MergeSort {
    public static void mergeSort(int[] a, int n) {
        // if n is 1
        if (n < 2) {
            return;
        }
        // divides the length (n) by 2
        int mid = n / 2;
        // store left part of the divide in l and right part in r
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        // loop to check if
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);


    }
}
