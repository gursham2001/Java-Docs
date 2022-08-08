package com.sparta.gs;

public class ReversedStrings {

    // In this kata we are working on reversing a string
    public static String reversing(String stringToReverse) {
        String reversed = "";

        for(int i = stringToReverse.length()-1; i >= 0; i--) {
            reversed += stringToReverse.charAt(i);
        }
        return reversed;
    }
}
