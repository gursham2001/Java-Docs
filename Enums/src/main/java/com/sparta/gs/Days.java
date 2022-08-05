package com.sparta.gs;

public enum Days {

    // just like a class but the only difference is there is a limit to the types
    // ie. useful for when you know there is a limitation of the type
    // we know we want to create buildings in a skyline and therefore enums are helpful

    // collection of pre-defined types
    // Enums cannot extend other classes as it has a class extended on to it
    // so enums are not allowed another extend as it alreay has a parent

    // if we have more than just the days in this
    // we have to extentiate it so provide a name and a date as its what our constructor is
    MONDAY("Monday", 0),
    TUESDAY("Tuesday", 1),
    WEDNESDAY("Wednesday", 2),
    THURSDAY("Thursday", 3),
    FRIDAY("Friday", 4),
    SATURDAY("Saturday", 5),
    SUNDAY("Sunday", 6);

    private String name;
    private int date;

    Days(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
