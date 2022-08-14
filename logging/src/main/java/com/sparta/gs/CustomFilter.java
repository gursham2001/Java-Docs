package com.sparta.gs;

import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {
    // filter to check if a method contains hello if so it returns that one
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().contains("hello");
    }
}
