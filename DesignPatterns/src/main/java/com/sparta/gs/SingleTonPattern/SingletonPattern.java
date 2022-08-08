package com.sparta.gs.SingleTonPattern;

public class SingletonPattern {

    // we used final as we don't want to change this
    private static final SingletonPattern SINGLETON = new SingletonPattern();

    // we make this private as we want to hide the constructor, so it can only be seen in this class
    private SingletonPattern() {}

    // create a getter for the object we created and return singleton
    // has to be static as our field we are returning ie Singleton is static
    public static SingletonPattern getSingleton() {
        return SINGLETON;
    }

}
