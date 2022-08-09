package com.sparta.gs;

public class Node {

    private final int value; //  once given a value it will not change

    // using the node class we created on this as we want to make our right and left child have a left and right
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty() {
        // will allow me to check given any node to check if it doesnt have a left child
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isRightChildEmpty() {
        // will allow me to check given any node to check if it doesnt have a right child
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }




}
