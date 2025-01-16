package com.axsosacademy.bst;

public class Main {

	public static void main(String[] args) {
		BinarySearchTreeNode node1 = new BinarySearchTreeNode(70);
		node1.insertBSTNode(10);
		node1.inOrderTraversal(node1);
		
		System.out.println();
		System.out.println("====================");
		
		node1.insertBSTNode(50);
		node1.insertBSTNode(40);
		node1.inOrderTraversal(node1);
		
		System.out.println();
		System.out.println("====================");
		
		node1.insertBSTNode(80);
		node1.insertBSTNode(5);
		node1.inOrderTraversal(node1);
		
		System.out.println();
		System.out.println("====================");
		
		node1.insertBSTNode(1000);
		node1.insertBSTNode(1);
		node1.inOrderTraversal(node1);
		
		System.out.println();
		System.out.println("====================");
		
		node1.insertBSTNode(30);
		node1.insertBSTNode(20);
		node1.inOrderTraversal(node1);
		
		System.out.println();
		System.out.println("====================");
	}

}