package com.axsosacademy.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(70);
        tree.insert(10);
        tree.inOrderTraversal();

        System.out.println("====================");

        tree.insert(50);
        tree.insert(40);
        tree.inOrderTraversal();

        System.out.println("====================");

        tree.insert(80);
        tree.insert(5);
        tree.inOrderTraversal();

        System.out.println("====================");

        tree.insert(1000);
        tree.insert(1);
        tree.inOrderTraversal();

        System.out.println("====================");

        tree.insert(30);
        tree.insert(20);
        tree.inOrderTraversal();

        System.out.println("====================");

        BinarySearchTreeNode foundNode = tree.search(50);
        System.out.println("Search Result: " + (foundNode != null ? foundNode.val : "Not Found"));
    }
}