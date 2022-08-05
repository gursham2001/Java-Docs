package com.sparta.gs;

public abstract class Animal {

    // abstract class looks like a normal class but cannot be implemented so we cant create an animal object
    // used for referencing its children
    // so we only use abstract if we dont want to create animals but want to reference its fields

    // so to allow inheritance to happen we have to use extends and the class name we want to extract the code

    private String name;
    private int age;
    private String breed;

    // by making these avaliable in the animal object we now have access to it in the dog and cat area
    // constructor
    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // we do an if statement to ensure the cat is above or equal to 1 years old
        if (age >= 1){
            this.age = age;
        }
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void play() {
        // this method will allow us to play when we call it in the places we extended this
        System.out.println("The animal is playing");
    }

    // when we want this we do right-click and press generate and then toString
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
