package com.sparta.gs;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpartanTests {
    // we aim to have one test file for each java file

    // Hooks - block of repeated code
    // BeforeAll, BeforeEach, AfterAll, AfterEach
    // BeforeAll - runs code before all tests are run
    // BeforeEach - runs code before each test are run
    // AfterAll - runs code after all test is run
    // AfterEach - runs code after each test is run
    // described as setups and teardowns

    private Spartan spartan;

    // have to use @BeforeAll to initiate it
    @BeforeAll
    static void initAll(TestInfo testInfo) {
        // TestInfo interface allows us to pull out info from each test
        System.out.println(testInfo.getTestClass() + " has started");
    }

    @BeforeEach
    void initBefore(TestInfo testInfo) {
        spartan = new Spartan(1, "manish", "Java", LocalDate.of(2022, 12, 12));
        System.out.println(testInfo.getDisplayName() + " is executing");
    }

    // @Test
    // @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    // allows you to not run a test if the operating version is not correct

    // there is also enabledIf methods to use

    @Test
//    @DisabledIf(value = "checkForSpartan",
//    disabledReason = "Code has not been completed yet"
//    ) // disabled if allows us to set a condition to disable a test
    @DisplayName("Check the spartan is manish")
    void checkSpartanCalledManish() {
        Assertions.assertEquals("manish", spartan.getName());
    }

    // using repeated tests
    // value = number of times repeated tests will run
    @Tag("valueCheck") // asks for string
    @RepeatedTest(value = 6, name = RepeatedTest.LONG_DISPLAY_NAME)
    @Test
    @DisplayName("check that id is a positive number")
    void checkIdIsAPositiveNumber() {
        assertTrue(spartan.getId() >= 0);
    }

    // what we want to do after tests are done
    @AfterEach
    void tearDownEach(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " completed");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " has finished");
    }

    // using Assumptions.assumTrue = if it fails assumption tes is ignored if it passes test will occur

    // nesting a test
    // use them to break up tests
    @Nested
    @DisplayName("Nested test")
    class NestedTest {
        @Test
        @DisplayName("Another test")
        void anotherTest() {
            System.out.println("another test");
        }
    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/courses.csv")
    @DisplayName("Check if course is one of the following")
    void checkIfCourseIsOneOfTheFollowing(String course) {
        assertTrue(course.contains("Java"));
    }

    @Test
    @DisplayName("Check if the date joined ")
    void checkIfTheDateJoined() {
        assertTrue(spartan.getStartDate().isAfter(LocalDate.now()));
    }

    @Test
    @DisplayName("Check that ID is above zero")
    void checkThatIDIsAbove10 () {
        assertTrue(spartan.getId() >=10 && spartan.getId() <= 10_000);
    }
}
