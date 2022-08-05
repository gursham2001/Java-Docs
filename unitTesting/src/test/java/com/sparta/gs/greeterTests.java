package com.sparta.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class greeterTests {

    @Test
    @DisplayName("This is my first test")
    void firstTest(){
        // need to tell java what we are expecting to see
        // and it compares it to what it sees

        Assertions.assertEquals(1, 1);
    }

    @DisplayName("Given time is 21, return Good evening")
    void givenTheTimeIs21() {
        Assertions.assertEquals("Good Evening", Greeter.greet(21));
    }
    // all tests are public
    // we don't need to give tests an access modifier

//    @Test
//    @DisplayName("Given time is 5 to smaller than 12")
//    void givenTheTimeIs5toBelow12() {
//        Assertions.assertEquals("Good Morning", Greeter.greet(>= 5 && >= 12 ));
//    }
}
