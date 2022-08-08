package com.sparta.gs.Decorator.Sides;

import com.sparta.gs.Decorator.Pizza;

public class Chips extends Sides{

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 15;
    }
}
