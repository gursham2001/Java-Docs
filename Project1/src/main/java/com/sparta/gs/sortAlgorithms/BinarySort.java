package com.sparta.gs.sortAlgorithms;

import com.sparta.gs.sortAlgorithms.BinaryTree.BinaryTree;

public class BinarySort implements Sorter {
    @Override
    public int[] SortArray(int[] arrays) {
        BinaryTree tree = new BinaryTree(arrays);
        return tree.getSortedTreeAsc();
    }
    @Override
    public String toString() {
        return "BinarySort";
    }
}
