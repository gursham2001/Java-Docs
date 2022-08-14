package com.sparta.gs;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    // when we code to a interface we know what we want but not the implementation/ how we want it
    // when we code to a class we know what we want and how we want it
    public static void main(String[] args) {
        // how we initiate a list
        // List is a interface
        // the thing that goes after new is the type of list we want
        List<String> myList = new ArrayList<>(); // We have all the methods of lists but the class we use after new holds the implementation we need
        // ie how we add and show things

        // adding to lists
        myList.add("Gursham");
        myList.add("Sunil");
        myList.add("Keivi");

        System.out.println(myList);

        // boolean if Gursham is in the list
        System.out.println(myList.contains("Gursham"));
    }

}
