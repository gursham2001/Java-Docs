package com.sparta.gs;

public class Strings {
    public static void main(String[] args) {

        // we don't need to use new and we deal with it slightly different from normal objects
        String word1 = "Hello";
        String word2 = "Hello";
        String word3 = new String("Hello");

        // hashcodes gives unique identifier to the string
        // will be the same even tho wor1/2 is written differently from word 3
        // as the words are the same
        System.out.println(word1.hashCode());
        System.out.println(word2.hashCode());
        System.out.println(word3.hashCode());

        // identityHashcode - will be different as the the way 1 and 3 are written are different
        // when we use new it creates a new object in the string pool hence it has a new identity hash code
        System.identityHashCode(word1);
        System.identityHashCode(word2);
        System.identityHashCode(word3);

        // if we compare word 1 and word 3 with a == it will
        System.out.println(word1 == word3);
        // this will be false as it compares identity hashcodes

        // if we do .equals it will
        System.out.println(word1.equals(word3));
        // this will be true as it compares hashcodes and not identity hashcodes

        // strings are immutable so once we create a string we cant alter it so it will not work
        word2.toUpperCase();
        System.out.println(word2);
        // we can make a string mutable so we can change it by using

        // StringBuilder - this is not thread safe but we can do things like this
        System.out.println(new StringBuilder("Gursham").reverse().toString());
        // StringBuffer

    }
}
