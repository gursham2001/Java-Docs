package com.sparta.gs;

public class MergeArray {
    public static int[] mergeArraySorter(int[] arr1, int[] arr2) {
        int arrayLengths = arr1.length + arr2.length;
        int[] sortedArray = new int[arrayLengths];

        int currentArr1Index = 0;
        int currentArr2Index = 0;

        mergeArray(arr1,arr2,arrayLengths,sortedArray,currentArr1Index,currentArr2Index);
        return sortedArray;
    }

    private static void mergeArray(int[] arr1,int[] arr2,int arrayLengths,int[] sortedArray,int currentArr1Index, int currentArr2Index) {
        for(int indexOfSortArray = 0; indexOfSortArray <= arrayLengths - 1; indexOfSortArray++) {
            if (currentArr1Index > arr1.length - 1) {
                sortedArray[indexOfSortArray] = arr2[currentArr2Index];
                currentArr2Index++;
            } else if (currentArr2Index > arr2.length - 1) {
                sortedArray[indexOfSortArray] = arr1[currentArr2Index];
                currentArr1Index++;
            } else if (arr1[currentArr1Index] < arr2[currentArr2Index]) {
                sortedArray[indexOfSortArray] = arr1[currentArr1Index];
                currentArr1Index++;
            } else if (arr2[currentArr2Index] < arr1[currentArr1Index]) {
                sortedArray[indexOfSortArray] = arr2[currentArr2Index];
                currentArr2Index++;
            } else {
                sortedArray[indexOfSortArray] = arr1[currentArr1Index];
                currentArr1Index++;
            }
        }
    }

}
