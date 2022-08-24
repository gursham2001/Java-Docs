package com.sparta.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterisedTest {

    @ParameterizedTest(name = "{index} of {argumentsWithNames}")
    @ValueSource(ints = {1, 20, 13, 6, 8})
    @DisplayName("check for ints higher than 10")
    void checkForIntHigherRThan10(int num) {
        assertTrue(num > 10);
    }

    @ParameterizedTest()
//    @CsvSource({"David", "Manish"}) // should use fileSource instead
    @CsvFileSource(resources = "/names.csv") // we can make a resourses directory to put this in
    @DisplayName("Using csv source for test")
    void runCsvTest(String name) {
        assertEquals(5, name.length());
    }

    @ParameterizedTest()
    @MethodSource("sourceMethod")
    void usingMethodSource(int number, String name) {
        assertEquals(name.length(),number);
    }

    public static Stream<Arguments> sourceMethod() {
        return Stream.of(
                Arguments.of(1, "manish"),
                Arguments.of(2, "david"),
                Arguments.of(2, "danny")
        );
    }

    // how we can test for exceptions
    @ParameterizedTest
    @ValueSource(ints = {1, 3,5,7,8, 10})
    @DisplayName("Testing for exceptions")
    void testingForExceptions(int number) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,3,5));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> numberList.get(number)); // take each num as a param
        // passes test if it throws the exception
    }
}
