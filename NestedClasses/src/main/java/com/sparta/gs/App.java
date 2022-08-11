package com.sparta.gs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan("Dave", LocalDate.now()),
                new Spartan("David", LocalDate.now()),
                new Spartan("Manish", LocalDate.now())
        ));

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
        Spartan.SpartanComparator comparator = new Spartan.SpartanComparator();
        // if not static
        // Spartan.SpartanComparator comparator = spartanObject.new SpartanComparator();
        Collections.sort(spartans, comparator);
        spartans.sort(comparator);
        System.out.println(spartans);
    }

    // Anonymous inner class
}
