package com.sparta.gs;

import java.time.LocalDate;
import java.util.Comparator;

public class Spartan {

    // implements Comparable<Spartan>
    private String name;
    private LocalDate startDate;

    // By putting this nested class in the class spartan
    // we are telling it only Spartan cares about this clsss

    // Nesting the class
    // Nested inner class
    // when calling a static method we call it by the name of the class
    public static class SpartanComparator implements Comparator<Spartan> {
        @Override
        public int compare(Spartan o1, Spartan o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public Spartan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    // took this from Comaparable interface
    // as we need to tell it how to sort our spartans as there are multiple ways to do it
//    @Override
//    public int compareTo(Spartan otherSpartan) {
//        // we call name to sort by using compare to
//        return this.getName().compareTo(otherSpartan.getName());
//    }
}
