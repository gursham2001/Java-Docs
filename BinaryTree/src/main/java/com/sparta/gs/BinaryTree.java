package com.sparta.gs;

// public - methods you can access
// private - implementation
// abstract away the nodes - os the user will only enter values and not the nodes

public class BinaryTree implements BinaryTreeInterface{
    // the way we build it is not the only way there are other ways to build the tree

    // modelling the binary tree

    private final Node rootNode;

    public BinaryTree(int elements) {
        rootNode = new Node(elements);
    }

    // public part of the binary method
    public void addElementToTree(int element) {
        addNodeToTree(rootNode, element);
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


    // binary tree algorythm
    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            // check if there is a existing child in the left
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                // recursively move to the next left parent as it exists
                addNodeToTree(node.getLeftChild(), element);
            }
        } else {
            // same for the right side
                if (node.isRightChildEmpty()) {
                    node.setRightChild(new Node(element));
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }
    }

    // functionality to check if an element exists in the tree
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
        // if no if statements are not fulfilled return null
        return null;
    }


}
