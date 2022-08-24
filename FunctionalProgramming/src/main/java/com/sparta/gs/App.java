package com.sparta.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        // we can create parallel streams doing more than one operation at one time

        // Lambda expression is not a short cut but it only includes what is needed
        Printable printable = item -> System.out.println("I have a " + item);
        // example of use
        printable.print("car");

        // Access Modifiers, Name and Return type is not needed as it comes from the Interface
        // we need the params if any and the method body

        //Functional programming is manipulating data
        //Data should be immutable in Functional Programming
        //Stream - A stream is a class type that allows us to do functional programming
        //Filter -
        //Map
        //Pure Function -

        ArrayList<String> beatles = new ArrayList<>(Arrays.asList(
                "John",
                "Paul",
                "George",
                "Ringo"
        ));

        // convert arraylist to stream
        beatles.stream()
                // the . funtions are called intermediate operations as it gives another stream back
                .filter(name -> name.contains("o")) // looks at data and creates filter for it
                // returns a new stream does not alter previous stream
                .map(String::toUpperCase)// look at each value in stream and transform them based on param given
                // so return it toUppercase
                .toList() // can do instead of forEach and sout
                .forEach(System.out::println); // terminal operation as its something real we can work with
                // we can print each name with o in uppercase
    // using this gives us opportunity to use methods of stream

        String sen = "The quick brown fox jumps over the lazy dog";
        System.out.println(containAllAplha(sen));
    }

    // functional programming to check if a string contains all the alphabet
    private static boolean containAllAplha(String word) {
        return word
                .toLowerCase()// makes the string lowecase
                .chars()
                .filter(letter -> letter >= 'a' && letter <= 'z')
                .distinct() // removes all the duplicates
                .sorted()// sorts the order
                .peek(System.out::println)// allows us to see the stream at any point
                .count() == 26; // check if the count is 26
    }
}
