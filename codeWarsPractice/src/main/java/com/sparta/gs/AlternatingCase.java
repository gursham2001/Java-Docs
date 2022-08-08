package com.sparta.gs;

public class AlternatingCase {

    // if character is upper case make lower case
    // if lower case make uppper case

    public static String toAlternativeString(String string) {

        String temp = "";
        for (int i = 0; i < string.length(); i++) {
            temp += i;
            if (temp.isLowerCase(i))
        }
        return string;
    }
}
