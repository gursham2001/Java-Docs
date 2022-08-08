package com.sparta.gs.SingleTonPattern;

import com.sparta.gs.SingleTonPattern.SingletonPattern;

public class App {

    // creational patterns - how objects are created

    // structural patterns - how objects are structured
    // behavioural patterns - how objects behave

    public static void main(String[] args) {

        // cant do this instead we do the one below
//        SingletonPattern s1 = new SingletonPattern();
//        SingletonPattern s2 = new SingletonPattern();
//        // the hash values will be different as we created two new singleton patterns
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        // if we wanted a scenario where the class will only have one object
        // and when we want to create a new instance it refers back to the previous object
        // we want it so that there is only ever one object but we can make it look we can create as many as we want

        // now there is only ever going to be one object of the class so the hashvalue will always be the same
        SingletonPattern s1 = SingletonPattern.getSingleton();
        SingletonPattern s2 = SingletonPattern.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
