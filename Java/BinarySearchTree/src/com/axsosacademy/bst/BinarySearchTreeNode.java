package com.axsosacademy.bst;

class BinarySearchTreeNode {
	int val;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;

	BinarySearchTreeNode() {}

	BinarySearchTreeNode(int val) {
		this.val = val;
	}

	BinarySearchTreeNode(int val, BinarySearchTreeNode left, BinarySearchTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
