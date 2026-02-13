// Last updated: 2/13/2026, 9:47:36 AM
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
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        // left subtree
        inorder(node.left);

        // process current node
        if (prev != null) {
            int diff = node.val - prev;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        prev = node.val;

        // right subtree
        inorder(node.right);
    }
}
