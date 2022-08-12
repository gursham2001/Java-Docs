package com.sparta.gs.sortAlgorithms.BinaryTree;

// public - methods you can access
// private - implementation
// abstract away the nodes - os the user will only enter values and not the nodes

import com.sparta.gs.Exceptions.ChildNotFoundException;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    private int index;

    public BinaryTree(int elements) {
        rootNode = new Node(elements);
    }
    // polymorphism
    public BinaryTree(final int[] array) {
        rootNode = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            addElementToTree(array[i]);
        }
    }
    public void addElementToTree(int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }
    @Override
    public int getNumberOfElements() {
        // returns the numOfNodes method, with the root node as the parameter, will pass it
        return numOfNodes(rootNode);
    }
    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode, element);
    }
    @Override
    public void addElements(int[] elements) {
        for (int i : elements) {
            addElementToTree(i);
        }
    }
    // public of findNode
    public boolean findElement(int element) {
        // call the method and capture the node
        Node node = findNode(element);
        if (node != null) {
            // if its nto equal to null we return true to say we found it
            // else false to say we haven't
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getLeftChild().getValue();
    }
    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getRightChild().getValue();
    }
    @Override
    public int[] getSortedTreeAsc() {
        index = 0;
        int[] sortedArray = new int[getNumberOfElements()];
        return returnAscendingTree(sortedArray, rootNode);
    }
    private int[] returnAscendingTree(int[] sortedArray, Node node) {
        if (!node.isLeftChildEmpty()) {
            returnAscendingTree(sortedArray, node.getLeftChild());
        }
        sortedArray[index++] = node.getValue();
        if (!node.isRightChildEmpty()) {
            returnAscendingTree(sortedArray, node.getRightChild());
        }
        return sortedArray;
    }
    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray = new int[getNumberOfElements()];
        index = 0;
        return returnDescendingTree(sortedArray, rootNode);
    }
    private int[] returnDescendingTree(int[] sortedArray, Node node) {

        if (!node.isRightChildEmpty()) {
            returnDescendingTree(sortedArray, node.getRightChild());
        }
        sortedArray[index ++] = node.getValue();
        if (!node.isLeftChildEmpty()) {
            returnDescendingTree(sortedArray, node.getLeftChild());
        }
        return sortedArray;
    }
    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else {
                if (node.isRightChildEmpty()) {
                    node.setRightChild(new Node(element));
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }
    }
    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else if (element > node.getValue()) {
                node = node.getRightChild();
            }

        }
        return null;
    }
    private int numOfNodes(Node rootNode){
        if (rootNode == null) {
            return 0;
        }
        return 1 + numOfNodes(rootNode.getLeftChild()) + numOfNodes(rootNode.getRightChild());
    }

    // nested class
    private class Node {
        private final int value;
        public Node left;
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
        }public Node getRightChild() {
            return rightChild;
        }
        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            } else {
                return false;
            }
        }public boolean isRightChildEmpty() {
            if (rightChild == null) {
                return true;
            } else {
                return false;
            }
        }
    }
}
