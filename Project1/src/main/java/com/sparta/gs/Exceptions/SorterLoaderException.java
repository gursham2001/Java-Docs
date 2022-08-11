package com.sparta.gs.Exceptions;

public class SorterLoaderException extends Throwable {
    public String SorterLoaderException(String s) {
       // if sort is not found return message
        return ("Invalid sorter option");
    }
}
