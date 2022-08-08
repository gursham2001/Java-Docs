package com.sparta.gs.Decorator;

public class Cheese extends Pizza{
    @Override
    public String getDescription() {
        return "Cheese";
    }
    @Override
    public double getCost() {
        return 15;
    }
}
