package com.sparta.gs.Decorator;

import com.sparta.gs.Decorator.Sides.Chips;
import com.sparta.gs.Decorator.Sides.Salad;

public class DecoratorPattern {
    // this is good for when we have something we want to add but not to all the objects we create

    public static void main(String[] args) {

        Cheese cheese = new Cheese();
        System.out.println(cheese.getDescription() + " cost " + cheese.getCost());

        // now we decorate cheese pizza

        // looking for cheese pizza in params
        // now we can see the cost has been decorated and also description has been changed
        Salad salad = new Salad(cheese);
        System.out.println(salad.getDescription() + " cost " + salad.getCost());

        Chips chips = new Chips(cheese);
        System.out.println(chips.getDescription() + " cost " + chips.getCost());

    }
}
