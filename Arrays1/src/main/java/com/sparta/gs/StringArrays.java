package com.sparta.gs;

public class StringArrays {
    static String name;
    static String newName;
    static String diffName;

    public static void main(String[] args) {

        name = "Hello";
        newName = "Hello";
        diffName = "Hello1";

        name.length(); // --> tells us the length

        // -- if two strings are exactly the same it will go in the same string pool and have the same location
        // -- if different it will have a different hashcode/ memory address
        System.out.println(name.hashCode()); // --> will give us the hashcode another way to think of it is storage location
        System.out.println(newName.hashCode());
        // when we print this out this will be different to name and newName as the value is different
        System.out.println(diffName.hashCode());

        // -- ! another way to compare is using == operand as it will compare character by character and give a boolean statment ie
        System.out.println(name == newName);
        System.out.println(name == diffName);

        // -- ! using .equals will also compare letter by letter
        System.out.println(name.equals(newName));
        System.out.println(name.equals(diffName));

        String a = "a";
        String a1 = "a";
        String b = "b";
        // if first value is less than the second value it returns -1
        // if both values are the same then we get 0
        // if first value is greater than the second it returns 1
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(a1));

        // --> ! we could compare two elements in an array by doing
        // nameOfArray[indexOfValueWeWantToCompare].compareTonameOfArray[indexOfValueWeWantToCompare]
    }

    static String[] biggestStr(String[] array) {
        // finds biggest string in array
        String temp;

        for(int element = 0; element < array.length -1; element++) {
            if(array[element].compareTo(array[element+1]) >= 1){
                temp = array[element];
                array[element] = array[element + 1];
                array[element + 1] = temp;
            }
        }
        return array;
    }
}
