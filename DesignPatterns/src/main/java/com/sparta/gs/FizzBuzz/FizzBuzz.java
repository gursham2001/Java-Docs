package com.sparta.gs.FizzBuzz;

// if divisible by 3 returns Fizz
// if divisible by 5 returns Buzz

public class FizzBuzz {

    // Using red, Green and refactor
    // red = Write a failing test
    // green = write a simple test that passes
    // refactor = refactor code without failing other test
    public static String getValue(int number) {
        String answer = "";

        if (number % 3 == 0 && number % 5 == 0) {
            answer = "FizzBuzz";
        } else if (number % 3 == 0) {
            answer = "Fizz";
        } else if (number % 5 == 0) {
            answer = "Buzz";
        }
        return answer;
    }
}
