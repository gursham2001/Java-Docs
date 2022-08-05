package com.sparta.gs;

public class Cat extends Animal{// a class can have only one parent

    // extends allows us to pull in code from animal
    // super refers to the parent class

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    // we can override methods by doing right click generate and over methods and then choosing the method you override
    // this allows us to change methods we dont want to transfer into the class we bring code to
    @Override
    public void play() {
        System.out.println("The cat is playing");
    }
}
