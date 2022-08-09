package com.sparta.gs;


import java.util.Arrays;

public class fibonacciRecursion {


    public static void main(String[] args) {
        int number1 = 10;

        System.out.println(Arrays.toString(fibLoop(10)));


    }

    private static int getFibonacci(int number) {
        if (number <= 2) {
            return number;
        } else {
            return getFibonacci(number -1) + getFibonacci(number -2);
        }
    }

    public static int[] fibLoop(int number1) {
        int[] myArray = new int[number1];
        for (int i = 0; i <= number1 -1; i++) {
            myArray[i] = getFibonacci(i);
        }
        return myArray;
    }
}
