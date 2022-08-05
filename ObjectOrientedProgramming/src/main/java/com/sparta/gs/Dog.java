package com.sparta.gs;

public class Dog  extends Animal implements Speakable{

    // Practicing inheritance
    // we dont want to repeat code because some fields are the same from the Animal
    // so we want to take the Animal code and make it accessable to both animals

    // we create the constructer to match the animals constructor and pass the values here
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    // now we added a play method with a param so when we do . after the dogs name there will be two methods
    // we don't have a problem with this as the params are different
    // this is called overloading
    public void play(String name) {
        System.out.println(this.getName() + " is playing with " + name);
    }

    // we have to have this as we are referencing this interface
    // we can implement as many interfaces as we like
    @Override
    public void getAnimalName() {

    }
}
