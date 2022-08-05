package com.sparta.gs;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if (str.equals(reverse(str))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str) {
        // set a empty string variable to latter increment
        String rev = "";
        // for loop to reverse loop
        for (int i = str.length() -1; i >= 0; i--){
            // print out char
//            System.out.println(str.charAt(i));
            // increment each char to the empy variable
            rev += str.charAt(i);
        }
        // return this
        return rev;
    }
}


