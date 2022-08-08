package com.sparta.gs.FactoryPattern;

import com.sparta.gs.FactoryPattern.Speakable;

public class Cat implements Speakable {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
