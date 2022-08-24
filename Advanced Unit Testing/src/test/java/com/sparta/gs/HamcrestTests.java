package com.sparta.gs;

import com.sparta.gs.Spartan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

public class HamcrestTests {

    private Spartan spartan;

    @BeforeEach
    void setup() {
        spartan = new Spartan((1), "David", "Data", LocalDate.of(2022,12,12));
    }

    @Test
    @DisplayName("Check Spartan is called Manish")
    void checkSpartanIsCalledManish() {
        assertThat(spartan.getName(), equalTo("Manish"));
    }

    @Test
    @DisplayName("Check that Spartan has an ID field")
    void checkSpartanHasIDField() {
        assertThat(spartan, hasProperty("id", equalTo(1)));
    }

    @Test
    void hamcrestStringMethod() {
        assertThat(spartan.getName(), isEmptyOrNullString());
        //assertThat(spartan.getName(), startsWith("Ma));
        //assertThat(spartan.getName(), endsWith("sh));
    }

    // Tests
    // id - lower than 10000 - throw exception
    // id - above 10000 - passes
    // name - null string
    // name - more than 2 letters is valid name
    // course - if course matches the ones given
    // date - not in the past, current date or future
}
