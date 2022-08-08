package com.sparta.gs.FactoryPattern;

import com.sparta.gs.FactoryPattern.Speakable;

public class GoldFish implements Speakable {
    @Override
    public void speak() {
        System.out.println("Bubble");
    }
}
