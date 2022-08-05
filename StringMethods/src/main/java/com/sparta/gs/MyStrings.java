package com.sparta.gs;

public class MyStrings {

    public void sayHello() {
        System.out.println("Hello");
    }

    public boolean letterExists(String strIn, String strSearch) { // (if the string in the first param is included in the second param return true
        // this checks if the letter we are searching (strSearch) for is in the string (strIn)
        // returns true or false
        return strSearch.contains(strIn);
    }

    // reverse method
    public String reverse(String str) {
        // set a empty string variable to latter increment
        String rev = "";
        // for loop to reverse loop
        for (int i = str.length() -1; i >= 0; i--){
            // print out char
            System.out.println(str.charAt(i));
            // increment each char to the empy variable
            rev += str.charAt(i);
        }
        // return this
        return rev;
    }

    public boolean isPalindrome(String word) {
        return true || false;
    }

}
