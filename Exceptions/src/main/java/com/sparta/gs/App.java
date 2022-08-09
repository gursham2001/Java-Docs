package com.sparta.gs;

import java.util.zip.DataFormatException;

public class App {
    public static void main(String[] args) {

        // to deal with exceptions we can use try, catch
        int[] numbers = {1,2,3,4};
        System.out.println(numbers[6]);

        String[] letter = {"Manish", "David"};
        try {
            System.out.println(letter[10].toLowerCase());
        } catch (IndexOutOfBoundsException e) {// we add the exception we want to account for and add a variable name
            // we can print it or use err
//            e.printStackTrace(); // gives full stack trace show where the issue is
            System.err.println("Error Error");
            // we can have as many catches of as many exceptions as we want
        } finally {
            // run no matter what happens
        }
    }
}
