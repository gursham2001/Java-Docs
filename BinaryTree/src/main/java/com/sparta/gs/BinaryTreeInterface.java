package com.sparta.gs;

public interface BinaryTreeInterface {
    // Build a binary tree which can be used to sort a simple array of ints

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(final int[] elements);

        boolean findElement(int value);

        int getLeftChild(int element) throws ChildNotFoundException;

        int getRightChild(int element) throws ChildNotFoundException;

        int[] getSortedTreeAsc();

        int[] getSortedTreeDesc();

}
