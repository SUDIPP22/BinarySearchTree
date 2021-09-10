package com.bridgelabz;

/**
 * Purpose : To implement Binary Search Tree Operations
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-08
 */
public class BinaryTree {
    public static void main(String[] args) {
        System.out.println("Welcome To Binary Tree Program");
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(56);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(70);
        myBinarySearchTree.print(myBinarySearchTree.root);
    }
}
