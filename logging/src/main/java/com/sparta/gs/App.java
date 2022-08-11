package com.sparta.gs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger("myclogger");

    public static void main( String[] args ) {

        logger.log(Level.INFO, "This is a info message");
    }
}
