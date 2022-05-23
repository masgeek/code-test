package com.munywele.binarytree;

/**
 * A node in a binary tree has a key, a left child, and a right child
 */
public class Node {
    int key;
    Node right;
    Node left;

    public Node(int key){
        this.key = key;
        this.right = null;
        this.left = null;
    }
}
