package com.sparta.gs.FizzBuzzTests;

import com.sparta.gs.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    // Red, Green, Refactor

    @Test
    @DisplayName("Given the number is divisible 3 return Buzz")
    void givenTheNumberIsDivisibleByThree() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(3));
    }

    @Test
    @DisplayName("Given the number is 5 return Buzz")
    void givenTheNumberIsDivisibleByFive() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(5));
    }

    @Test
    @DisplayName("Given the number is 5 return Buzz")
    void givenTheNumberIsDivisibleByFiveAndThree() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(15));
    }
}
