package com.sparta.gs;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    // Aspect Oriented Prgramming - Aop - where it is apart of the code in some sense but then it also is not

    // we don't use javas inbuilt logging wwe use the Apache Log4j logging framework

    // logging is when we can test a specific piece of code in a method to see if it works

    // creating a logger
    // we don't do this as it doesn't work
    // private static voice Logger logger = new Logger("my logger")
    // we actually call the get getLogger method to make it work
    private static final Logger logger = Logger.getLogger("myclogger");

    // Logging levels - it will print messages at that level and lower

    public static void main( String[] args ) {
        // exceptions should be thrown when there is another method to catch it and handle it

        // Handler - where do we log to? - responsible for printing
        // Loggers are responsible for the messages printing

        // Creating a file Handler - to handle and store logs
        // we push our logs to the resources folder
        // so instead of logs displaying in the console now it will be in mylog

        // we need to put this in a try catch to handle the try catch
        try {
            // we set append to true as everytime we run this the logs will add and not override
            FileHandler fileHandler = new FileHandler("src/main/resources/mylog.log", true);
            // we need to set a formatter to ask java to display the following
            fileHandler.setFormatter(new CustomFormatter());
            // we set the level to all
            fileHandler.setLevel(Level.ALL);
            // we now add another handler as the file handler
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            // we have to catch it as it before as it is a chile of runtimeexception
            throw new RuntimeException(e);
        }

        // So if we want to log to the console we do
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // we also need to set the level for consoleHandler ie
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFilter(new CustomFilter());

        // then we have to do addHandler so java knows we want to use this handler
        logger.addHandler(consoleHandler);
        // then we can use setLevel to set the level of all logs ie
        logger.setLevel(Level.ALL);

        logger.setUseParentHandlers(false); // turns of root logger so we can create our own handler

        // we can set levels for our logs

        // .info will provide and print a message out providing info about the thing we log
        // something important is happening
        logger.log(Level.INFO, "This is a info message");
        logger.log(Level.WARNING,"This is warning message");
        logger.log(Level.FINE, "This is a fine message");

        // OTHER levels
        // .config(configuration has taken place)
        // .Fine,(provides tracing information)
        // Finer (Fairly detailed tracing messages)
        // Finest (Highly detailed tracer messages)
        // .severe(something bad has happened)
        // .warning(warns you about something that could break code)
    }
}
