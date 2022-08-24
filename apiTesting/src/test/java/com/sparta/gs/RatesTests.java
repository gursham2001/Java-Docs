package com.sparta.gs;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sparta.gs.pojoTask.Rates;
import com.sparta.gs.pojoTask.RatesPojo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RatesTests {
    Rates rates;
    static RatesPojo ratesPojo;
    static ObjectMapper mapper = new ObjectMapper();
    @BeforeAll
    static void setUp() {
        try {
            ratesPojo = mapper.readValue(new File("src/main/resources/rates.json"),
                    RatesPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Check That Base Rates Is Three Letters")
    void checkThatBaseRateIsThreeLetters() {
        Assertions.assertEquals(3, ratesPojo.getBase().length());
    }

    @Test
    @DisplayName("Check that base rate is capitalised")
    void checkThatBaseRateIsCapitalised() {
        Assertions.assertEquals(ratesPojo.getBase().toUpperCase(), ratesPojo.getBase());
    }

    @Test
    @DisplayName("Check that the date is the correct format")
    void checkThatTheDateIsTheCorrectFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(ratesPojo.getDate(), formatter);
        Assertions.assertEquals(LocalDate.parse(ratesPojo.getDate(), formatter).toString(), ratesPojo.getDate());
    }

    @Test
    @DisplayName("Check that the date is in the past")
    void checkThatTheDateIsInThePast() {
        Assertions.assertTrue(LocalDate.parse(ratesPojo.getDate()).isBefore(LocalDate.now()));
        System.out.println(ratesPojo.isSuccess());
    }

    @Test
    @DisplayName("Check is isSuccess is true")
    void checkIsSuccessIsTrue() {
        Assertions.assertTrue(ratesPojo.isSuccess());
        System.out.println(ratesPojo.getRates());
    }

//    @Test
//    @DisplayName("Check that rates are capitalized")
//    void checkThatRatesAreCapitalized() {
//        Assertions.assertEquals(ratesPojo.getRates().getBND().toString().toUpperCase(), ratesPojo.getRates().getBND().toString());
//        Assertions.assertEquals(ratesPojo.getRates().getCZK().toString().toUpperCase(), ratesPojo.getRates().getCZK().toString());
//        Assertions.assertEquals(ratesPojo.getRates().getIQD().toString().toUpperCase(), ratesPojo.getRates().getIQD().toString());
//        Assertions.assertEquals(ratesPojo.getRates().getAED().toString().toUpperCase(), ratesPojo.getRates().getAED().toString());
//        Assertions.assertEquals(ratesPojo.getRates().getMKD().toString().toUpperCase(), ratesPojo.getRates().getMKD().toString());
//    }
}
