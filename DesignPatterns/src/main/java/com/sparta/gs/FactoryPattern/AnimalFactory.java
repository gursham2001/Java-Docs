package com.sparta.gs.FactoryPattern;

import com.sparta.gs.FactoryPattern.Cat;
import com.sparta.gs.FactoryPattern.Dog;
import com.sparta.gs.FactoryPattern.GoldFish;
import com.sparta.gs.FactoryPattern.Speakable;

public class AnimalFactory {
    // we can use Speakable as a reference to return type

    // we need to decide how the user will tell us what they want
    // we have three potential animals which the user could pick
    // we dont know which they will choose and we need to create the correct method for the one they choose
    // so we can do

    public static Speakable getAnimal(String animal) {
        // we want to call the object when the person chooses which animal they want hence we
        // do it in the switch statement to help java not make too many objects
        // calling at the time we need it
        return switch (animal) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "goldfish" -> new GoldFish();
            default -> null;
        };
    }
}
