package com.sparta.gs;

public class Greeter {
    public static String greet(int timeOfDay) {

        String message;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            message = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon";
        } else {
            message = "Good Evening";
        }
        return message;
    }
}
