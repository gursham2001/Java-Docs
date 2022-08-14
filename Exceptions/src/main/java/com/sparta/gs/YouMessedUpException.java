package com.sparta.gs;

public class YouMessedUpException extends Exception{

    // creating custom exxception
    // have to extend exception class
    private String name;

    public YouMessedUpException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return name + " messed up";
    }
}
