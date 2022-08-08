package com.sparta.gs.FactoryPattern;

public class FactoryPattern {

    // i want to give a person the ablity to create n object but i don't want them to think about how to create it
    // so we get told what they want and we abstract a method to create it
    // so person dealing with the code doesnt have to think about how its created

    // we want to create a animal factory
    // so we use an interface to like them all

    public static void main(String[] args) {
        // now we can create the object
        // this will not create a Dog method but it will be the interface type
        // ie Speakable

        Speakable dog = AnimalFactory.getAnimal("dog");
        System.out.println(dog.getClass());

        // we can call dog.speak() ie
        dog.speak();

        // we will not be able to see methods we create in the dog class as we are
        // referencing it all from the interface
    }
}
