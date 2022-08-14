package com.sparta.gs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    // we create a custom formatter to make java put what we want in the log file instead of what is
    // recommended
    @Override
    public String format(LogRecord record) {
        // so in this we got the date now
        // the level and the message of the log
        // we then call this in another file and it will format like this
        return LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)
                + " " + record.getLevel()
                + " " + record.getMessage()
                + "\n";
    }
}
