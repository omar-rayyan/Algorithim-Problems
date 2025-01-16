package com.axsosacademy.bst;

public class BinarySearchTreeNode {
	int val;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;
	
	BinarySearchTreeNode () {}
	
	BinarySearchTreeNode (int val) {
		this.val = val;
	}
	
	BinarySearchTreeNode (int val, BinarySearchTreeNode left, BinarySearchTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public BinarySearchTreeNode insertBSTNode(int val) {
		BinarySearchTreeNode root = this;
		if (root.val > val) { // switch to the left tree
			if (root.left != null) {
				return root.left.insertBSTNode(val);
			} else {
				BinarySearchTreeNode new_node = new BinarySearchTreeNode(val);
				root.left = new_node;
				return new_node;
			}
		}
		if (root.val < val || root.val == val) { // switch to the right tree
			if (root.right != null) {
				return root.right.insertBSTNode(val);
			} else {
				BinarySearchTreeNode new_node = new BinarySearchTreeNode(val);
				root.right = new_node;
				return new_node;
			}
		}
		// root = null
		BinarySearchTreeNode new_node = new BinarySearchTreeNode(val);
		return new_node;
	}
	
	public void inOrderTraversal(BinarySearchTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }
	
	public BinarySearchTreeNode searchBST(int target) {
		BinarySearchTreeNode root = this;
		if (root.val == target) { // root is value
			return root;
		}
		if (root.val > target) { // switch to the left tree
			return root.left.searchBST(target);
		}
		if (root.val < target) { // switch to the right tree
			return root.right.searchBST(target);
		}
		// root is null (target not found), therefore return null
		return null;
	}
	
}
