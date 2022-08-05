package com.sparta.gs;

public interface Speakable {
    // interfaces make for amazing contracts help people figure out how things will work
    // and help testers figure out what we will need to test on

    // inter faces can extend another interface
    // when we do that we have to make use of all the interfaces we extended in the area we used

    // we can use this because we can use implements and the name of it and we can implement as many interfaces as we like
    // interfaces are like a class that contain methods with no implementation

    // interfaces can have fields
    // does not need public as its already public

    // final on fields
    // we can use public final - if the field is final it means it cant be changed during runtime of the code

    // final on methods
    // if the method is set as final it means it cant be overridden

    // class
    // Cannot be extended

    // if final the name should be all caps
    String NAME = "Gursham";

    void getAnimalName();

    // if we want to have a method that has implementation we use Defualt!
    // this will allow the method to do something 
}
