package com.sparta.gs.Decorator.Sides;

import com.sparta.gs.Decorator.Pizza;

public class Salad extends Sides{

    public Salad(Pizza pizza) {
        super(pizza);
    }

    // using decorator to add salad
    @Override
    public String getDescription() {
        return pizza.getDescription() + "and salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
