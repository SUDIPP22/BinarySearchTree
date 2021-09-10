package com.bridgelabz;

public class MyBinarySearchTree<K extends Comparable<K>> {
    MyBinaryNode<K> root;

    public void add(int Key) {
        MyBinaryNode<K> newNode = new MyBinaryNode<>(Key);
        if (root == null) {
            root = newNode;
            return;
        } else {
            MyBinaryNode<K> current = root;
            MyBinaryNode<K> parent = null;
            while (true) {
                parent = current;
                // if key less than root assigning to left
                if (Key < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                // Assigning key to right
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /* This method is printing the elements of the BinaryTree  */
    public void print(MyBinaryNode<K> node) {
        if (node == null) {
            System.out.println("Tree is empty");
        } else {
            if (node.left != null)
                print(node.left);
            System.out.print(node.key + " ");
            if (node.right != null)
                print(node.right);
        }
    }

    public boolean search(int value) {
        root = searchNode(root, value);
        if (null != root)
            return true;
        else
            return false;
    }

    private MyBinaryNode<K> searchNode(MyBinaryNode<K> root, int key) {
        // root is null or key is present at root
        if (root == null || root.key == key)
            return root;
        // value is greater than key
        if (root.key > key)
            return searchNode(root.left, key);
        // value is less than key
        return searchNode(root.right, key);
    }
}
