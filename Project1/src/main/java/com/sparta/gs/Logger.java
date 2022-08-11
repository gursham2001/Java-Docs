//package com.sparta.gs;
//
//import java.io.IOException;
//import java.util.logging.ConsoleHandler;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//
//public class Logger {
//    // the first thing they have is a Handler = where do I log to?
//    // Handler is responsable to print the log
//    // logger responsable for messages
//    private static final Logger logger = Logger.getLogger("my logger");
//    public static void main( String[] args ) {
//
//        try {
//            FileHandler fileHandler = new FileHandler("src/main/resources/mylog.log", true);
//            logger.addHandler(fileHandler);
//            fileHandler.setLevel(Level.ALL);
//            fileHandler.setFormatter(new CustomerFormatter());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        ConsoleHandler consoleHandler = new ConsoleHandler();
//        //returns levels from that level and above, handler prints it, the logs, at that level
//        consoleHandler.setLevel(Level.ALL);
//        logger.addHandler(consoleHandler);
//        // records levels from that level and above
//        logger.setLevel(Level.ALL);
//        logger.setUseParentHandlers(false);
//        // 3 of the different level types
//        logger.log(Level.INFO, "This is an info messeage");
//        logger.log(Level.WARNING, "This is an Warning messeage");
//        logger.log(Level.FINE, "This is an fine messeage");
//    }
//}
