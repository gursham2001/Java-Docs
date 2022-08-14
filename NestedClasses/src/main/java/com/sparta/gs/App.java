package com.sparta.gs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        // Array list for spartan objects
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan("Dave", LocalDate.now()),
                new Spartan("David", LocalDate.now()),
                new Spartan("Manish", LocalDate.now())
        ));
        // we can do the above other than doing spartan.add()

        ArrayList<String> TmNt = new ArrayList<>(Arrays.asList(
                "Leonardo",
                "Donatello",
                "Michelangleo",
                "Rapheal"
        ));

        Collections.sort(TmNt);
        System.out.println(TmNt);

        // we need to call this by calling a object
        Spartan spartanObject = new Spartan("Manish", LocalDate.MAX);
        // if static we call the class and not the object
        // instantiating new spartan comparator
        Spartan.SpartanComparator comparator = new Spartan.SpartanComparator();
        // if not static
        // Spartan.SpartanComparator comparator = spartanObject.new SpartanComparator();
        // we do this to sort the collection spartan using the comparator
        Collections.sort(spartans, comparator);
        // name of array.sort is the same as the one above
        spartans.sort(comparator);
        System.out.println(spartans);

                
    }

    // Anonymous inner class
}
