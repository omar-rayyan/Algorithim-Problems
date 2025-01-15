/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (root != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            // Process the current node
            root = stack.pop();
            if (prev != null && root.val <= prev.val) {
                return false; // Violation of BST property
            }
            prev = root; // Update previous node to current
            
            // Traverse to the right subtree
            root = root.right;
        }
        
        return true; // If no violations are found, it's a valid BST
    }
}