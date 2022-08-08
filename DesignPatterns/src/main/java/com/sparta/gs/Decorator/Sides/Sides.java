package com.sparta.gs.Decorator.Sides;

import com.sparta.gs.Decorator.Pizza;

public abstract class Sides extends Pizza {

    // only avaliable to the children
    protected Pizza pizza;

    // one abstract class taking another one as a constructor parameter
    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }
}
