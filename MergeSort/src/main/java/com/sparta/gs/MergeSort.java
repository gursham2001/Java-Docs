package com.sparta.gs;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,5,7,9,0,2};
        System.out.println("Intial Array: ");
        printArray(array);

        array = mergeSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // one method we will call in the main
    // other method will be called recursively
    public static int[] mergeSort(int[] array) {
        if(array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;

        int[] left = new int[midpoint];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            // means if the lengths will not be even the right one will have more
            right = new int[midpoint + 1];
        }

        // populate left and right array
        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }



        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = new int[array.length];
        result = merge(left, right);

        // once those are complete we need result to be returned
        return result;
    }

    // method to merge and sort them
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        // while there are elements in either the left or right array we want to merge
        // if not we dont want to merge

        while(leftPointer < left.length || rightPointer < right.length) {
            // now we check if they both have elements in them
            if(leftPointer < left.length && rightPointer < right.length) {
                // because they do have elements in them we compare the elements
                if (left[leftPointer] < right[rightPointer]) {
                    // if left is smaller than right we make the result pointer th left
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    // if right is smaller than the left
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if(leftPointer < left.length) {
                // only elements in the left array we increment it to both result and left
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
