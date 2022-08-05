package com.sparta.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class palindromeTests {
        @Test
        @DisplayName("Given a string check if it is a palindrome")
        void isPalindromeTest1() {
            Assertions.assertEquals(true, PalindromeChecker.isPalindrome("racecar"));
        }

        @Test
        @DisplayName("Given a string check if it is a palindrome")
        void isPalindromeTest2() {
            Assertions.assertEquals(false, PalindromeChecker.isPalindrome("iAmNotApalindrome"));
        }
}
