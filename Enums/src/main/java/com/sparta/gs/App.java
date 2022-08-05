package com.sparta.gs;

public class App {
    public static void main(String[] args) {


        Days myDay = Days.FRIDAY;
        // returns the name of the enum
        System.out.println(myDay.name());

        // we can do compare to  see the positional difference ie friday to saturday
        // is -1 as it is one below
        // Friday to Friday = 0 as they are in the same position
        System.out.println(myDay.compareTo(Days.FRIDAY));
        System.out.println(myDay.compareTo(Days.SATURDAY));

        // we can use hashcodes in enums too

        // ordinal -- gives the number in comparison to relative order
        System.out.println(Days.FRIDAY.ordinal());
        // returns 4 as its indexed 4


        F1Enum merc = F1Enum.Mercedes;
        System.out.println(merc.ordinal());
        System.out.println(merc.getDriver1());
    }
}
