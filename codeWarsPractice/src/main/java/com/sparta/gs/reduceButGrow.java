package com.sparta.gs;

public class reduceButGrow {

    // Given a non-empty array of integers, return the result of multiplying the values together in order

    public static int grow(int[] x) {

        int result = 1;
        for (int a : x) {
            result *= a;
        }
        return result;
    }
}
