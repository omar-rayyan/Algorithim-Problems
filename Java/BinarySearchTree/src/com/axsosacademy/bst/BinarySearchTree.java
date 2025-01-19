package com.axsosacademy.bst;

public class BinarySearchTree {
	BinarySearchTreeNode root;

	BinarySearchTree() {}

	BinarySearchTree(BinarySearchTreeNode root) {
		this.root = root;
	}

	public void insert(int val) {
		root = insertBSTNode(root, val);
	}

	private BinarySearchTreeNode insertBSTNode(BinarySearchTreeNode node, int val) {
		if (node == null) {
			return new BinarySearchTreeNode(val);
		}
		if (val < node.val) {
			node.left = insertBSTNode(node.left, val);
		} else if (val > node.val) {
			node.right = insertBSTNode(node.right, val);
		}
		return node;
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
		System.out.println();
	}

	private void inOrderTraversal(BinarySearchTreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.val + " ");
			inOrderTraversal(node.right);
		}
	}

	public BinarySearchTreeNode search(int target) {
		return searchBST(root, target);
	}

	private BinarySearchTreeNode searchBST(BinarySearchTreeNode node, int target) {
		if (node == null || node.val == target) {
			return node;
		}
		if (target < node.val) {
			return searchBST(node.left, target);
		}
		return searchBST(node.right, target);
	}
}