package com.sparta.gs.util;

import java.util.Random;

public class getRandomArray {
    public static int[] randArray(int requiredLength) {
        Random rand = new Random();
        int[] randomArray = new int[requiredLength];
        for (int i = 0; i < requiredLength; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
    }
}
