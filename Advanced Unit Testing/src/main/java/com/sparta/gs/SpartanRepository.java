package com.sparta.gs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
public class SpartanRepository {
    private static final ArrayList<Spartan> spartans = new ArrayList<>();
    public static void addSpartan(Spartan spartan) {
        spartans.add(spartan);
    }
    public static Optional<Spartan> findSpartan(int id) {
        Spartan returnedSpartan = null;
        for (Spartan spartan : spartans) {
            if (spartan.getId() == id) {
                returnedSpartan = spartan;
            }
        }
        return Optional.ofNullable(returnedSpartan);
    }
    public static String getAllSpartans() {
        StringBuilder SpartansInArray = new StringBuilder();
        for (Spartan spartan : spartans) {
            SpartansInArray.append(spartan.toString()).append("\n");
        }
        return SpartansInArray.toString();
    }
    public static boolean removeSpartan(int id) {
        return spartans.removeIf(spartan -> spartan.getId() == id);
    }

    public static void main(String[] args) {
        addSpartan(new Spartan(1, "Manish", "Java", LocalDate.of(2022, 12, 12)));
        addSpartan(new Spartan(1, "David", "Java", LocalDate.of(2022, 12, 12)));
        addSpartan(new Spartan(1, "Sunil", "Java", LocalDate.of(2022, 12, 12)));

        if (findSpartan(3).isPresent()){
            System.out.println(findSpartan(3).get().getName());
        }
    }
}
