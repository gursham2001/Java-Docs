package com.sparta.gs;

public class Main {
    public static void main(String[] args) {

        String a = "ABCDEF";
        String b = "GHIJK";

        // calling myStrings file
        MyStrings stringy = new MyStrings();
        stringy.sayHello();

        // in myStrings.java
        // this checks if the letter is in the string and returns a true or false
        System.out.println(stringy.letterExists("i", "Hello"));
        System.out.println(stringy.letterExists("o", "Hello"));

        // printing out the char at index 1 so in this case B
        System.out.println(a.charAt(1));

        // Ascending order
        // for loop to loop through all chars and print all the chars at the index
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        // Decending order
        // for loop to loop through string and print out all chars in reverse
        for (int i = a.length() -1; i >= 0; i--){
            System.out.println(a.charAt(i));
        }

        // concatenate
        String c = a + b;
        System.out.println(c);

        // using +=
        String str = "abcd";
        str += "e"; // will add e to the end of str
        // another way of writing this is str = str + "e"
        System.out.println(str);

        // checking if our reverse method in MyStrings worked
        System.out.println(stringy.reverse(str));
    }

}
