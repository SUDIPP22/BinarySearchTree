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
        myBinarySearchTree.add(22);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(11);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(16);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(95);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(63);
        myBinarySearchTree.add(67);
        myBinarySearchTree.print(myBinarySearchTree.root);
        boolean flag = myBinarySearchTree.search(63);
        if (!flag) {
            System.out.println("\n63 is not present");
        } else {
            System.out.println("\n63 is present");
        }
    }
}
