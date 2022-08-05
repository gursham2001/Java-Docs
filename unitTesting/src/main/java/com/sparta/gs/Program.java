
package com.sparta.gs;

public class Program { // Class names are ideally Nouns (start with capital letter, We use camel case
    public static void main(String[] args) {
        // Java is a Strongly typed language - Where you have to mention a type of data

        int timeOfDay = 21; // Starts as lower case but we use camel case

        // Other data types are: boolean, float, double, long, char, but, short
        // (String is not a primitive data type it is an object

        System.out.println(Greeter.greet(timeOfDay));
    }

}

// Access Modifiers = Private, Public, Protected, Default
// Private is only usable in this file
// Public can be used in any file
// Protected visible by only its children
// Default

