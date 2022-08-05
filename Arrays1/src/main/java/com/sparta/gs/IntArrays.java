package com.sparta.gs;

import java.util.Random;

public class IntArrays {

    static Random rand = new Random();

    public static void main(String[] args) {

        int[] ages = getRandArray(50);

        // loop and print all elements
        for (int element : ages) {
            System.out.println(element);
        }

        // .length to find size of the array
        System.out.println("Length is " + ages.length);

        // a different for loop which we add a default element to 0
        // then we make sure element is not bigger than ages.length throughout the loops
        // then we increment 1 each loop until we reach ages.length where the loop will end
        for (int element = 0; element < ages.length - 1; element++) {
            System.out.println("Element is " + ages[element]);
            // this will print out the element we are currently on in the loop and the next one in the array
            System.out.println(ages[element] + " " + ages[element + 1]);
        }

        // we need a temp value to be used later
        int temp;
        // for loop as explained above
        for (int element = 0; element < ages.length - 1; element++) {
            // this will print out the element we are currently on in the loop and the next one in the array
            System.out.println(ages[element] + " " + ages[element + 1]);
            if (ages[element] > ages[element + 1]) {
                // if statment to check if current element is bigger than the next one
                // if so we want to swap it
                // so we assign temp to be the current element
                // and then swap reassign the current element to be the next one in line
                // and set the next element as temp
                // completing the swap
                System.out.println("Swapped");
                temp = ages[element];
                ages[element] = ages[element + 1];
                ages[element + 1] = temp;
            }
        }
        // we call the biggest method now
        System.out.println("biggest int in ages array is " + biggest(ages));
//        System.out.println("Values are " + Arrays.toString(ages));

        // then we can print out the whole thing
//        System.out.println("Values are " + Arrays.toString(ages));

        // return the bubblesorted values
        System.out.println("Bubble sorted Values are " + bubbleSort(ages));

    }

    // we can create a function to get a random num and store it in an array
    static int[] getRandArray(int requiredLength) {
        // we get an int array with a required length
        int[] array = new int[requiredLength];
        // for loop to generate a num until we reach the required length of the array
        for(int x = 0; x < requiredLength; x++) {
            // each loop we need to get a num with a range of 1 to 100
            array[x]= rand.nextInt(100);
            // print it out
            System.out.println(array[x]);
        }
        // and return the array
        return array;
    }

    static int biggest(int[] arrayToSearch) {
        // biggest is a variable to store the biggest value
        int biggest = 0;
        // temp value to store
        int tempo = 0;
        // for loop to find the biggest
        for (int i = 0; i < arrayToSearch.length - 1; i++) {
            // if statement to check if the value at i is bigger than biggest if so we move on
            if (arrayToSearch[i] > biggest) {
                // if statement to check if the current value is bigger than the next value
                if (arrayToSearch[i] > arrayToSearch[i + 1]) {
                    // if so we store current value in tempo
                    tempo = arrayToSearch[i];
                    // make the value after the current the current value
                    arrayToSearch[i] = arrayToSearch[i + 1];
                    // then assign the next value to the value stored in temp
                    arrayToSearch[i + 1] = tempo;
                }
            }
            // System.out.println("Values are " + Arrays.toString(arrayToSearch));
            // we have to return the last value of the array as that will be the biggest
            return arrayToSearch[arrayToSearch.length - 1];
        }
        return biggest;
    }

    // similar to finding the biggest but we sort the array and return the whole thing
    static int[] oneIteration(int[] arrayToSearch) {
        // biggest is a variable to store the biggest value
//        int biggest= 0;
        // temp value to store
        int tempo = 0;
        // for loop to find the biggest
        for (int i = 0; i < arrayToSearch.length - 1; i++) {
            // if statement to check if the current value is bigger than the next value
            if (arrayToSearch[i] > arrayToSearch[i + 1]) {
                // if so we store current value in tempo
                tempo = arrayToSearch[i];
                // make the value after the current value
                arrayToSearch[i] = arrayToSearch[i + 1];
                // then assign the next value to the value stored in temp
                arrayToSearch[i + 1] = tempo;
            }
        }
        // System.out.println("Values are " + Arrays.toString(arrayToSearch));
        // we return the whole array which is sorted
        return arrayToSearch;
}

    static int[] bubbleSort(int[] arrayToSort) {
        // this code loops over all ages elements
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            // we then ask oneIteration to sort the ages in order
            arrayToSort = oneIteration(arrayToSort);
        }
//        System.out.println("Values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }

}
