package com.sparta.gs;

import org.w3c.dom.html.HTMLImageElement;

public class OOP {

    // 4 pillars of OOP

    // Encapsulation - keeping similar fields and methods together. Setting the boundaries.
    // Abstraction - hiding implementation and exposing important things what someone else needs
    // Inheritance - a parent class of handing down functionally (object is the great grand parent)
    // Polymorphism - many forms of


    public static void main(String[] args) {
        // Private String name = "Gursham"
        Cat tim = new Cat("tim" , 1, "tubby");
        System.out.println(tim);
        Dog tyson = new Dog("Tyson", 5, "Staffy");
        System.out.println(tyson);

        // if we want to see the class of something we can do
        tyson.getClass();

        tyson.play();
        tyson.play("manny");
        tim.play();

        // we can store these animals as a collection even tho one is a dog and the other is a cat
        // we can do this because they relate to the animal class
        Animal[] animals = {tim, tyson};
    }

    // we can create a loop that will loop over the animal and run the method .play
    private static void doPlay(Animal[] animals){
        for (Animal animal : animals) {
            animal.play();
        }
    }

}
