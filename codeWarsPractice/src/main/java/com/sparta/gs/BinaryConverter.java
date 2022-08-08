package com.sparta.gs;

public class BinaryConverter {

    // In this kata we want to convert numbers in a string to binary
    // so the numbers below 5 should be changed to 0
    // and numbers 5 and above should be changed to 1
    public static String numbersToBin(String numberString) {

        String binaryStr = "";

        for(int i = 0; i < numberString.length(); i++) {
//            System.out.println(numberString.charAt(i));
            if (numberString.charAt(i) >= '5') {
                System.out.println("smaller");
                binaryStr += '0';
            } else {
                System.out.println("bigger");
                binaryStr += '1';
            }
        }
        return binaryStr;

        // another method is using replace all
        //        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
