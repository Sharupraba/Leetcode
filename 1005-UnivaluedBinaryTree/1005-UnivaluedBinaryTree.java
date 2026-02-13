// Last updated: 2/13/2026, 9:47:19 AM
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
    public boolean isUnivalTree(TreeNode root) {
        // Call the helper function with the root and its value
        return check(root, root.val);
    }

    // Helper method to check all nodes
    public boolean check(TreeNode node, int value) {
        if (node == null) {
            return true; // Base case: empty node is fine
        }

        // If current node value is not same, return false
        if (node.val != value) {
            return false;
        }

        // Recursively check left and right
        return check(node.left, value) && check(node.right, value);
    }
}
