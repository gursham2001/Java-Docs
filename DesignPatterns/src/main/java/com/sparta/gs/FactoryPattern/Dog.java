package com.sparta.gs.FactoryPattern;

import com.sparta.gs.FactoryPattern.Speakable;

public class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
