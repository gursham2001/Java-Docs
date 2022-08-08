package com.sparta.gs.Decorator;

public abstract class Pizza {

    // we dont want to instantiate the class so we use abstract but any class that extends this uses the two fields

    private String description;
    private double cost;
    public String getDescription() {
        return description;
    }
    public double getCost() {
        return cost;
    }

}
