package com.sparta.gs;

public class RecursionExamples {

    // very memory efficient
    private static int getFactorial(int number) {
        // in recursion this is called a base case - when do we stop?
        if (number == 1) {
            return 1;
        } else {
            // if our number is 5 we skip the if number = 1 part and move on to the else
            // it will then multiply by getFactorial number - 1 so 4 and then the next loop 3
            // until we reach the base case and loop will end
            return (number * getFactorial(number - 1));
        }
    }

}
