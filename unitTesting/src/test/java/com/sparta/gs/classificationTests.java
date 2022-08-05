package com.sparta.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class classificationTests {
    @Test
    @DisplayName("Bellow12")
    void Bellow_12() {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications( 11));
    }

    @Test
    @DisplayName("is12")
    void is12( ) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications( 12));
    }

    @Test
    @DisplayName("over12To15")
    void over12(){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications((15)));
    }

    @Test
    @DisplayName("over18")
    void over18(){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications((20)));
    }
}
