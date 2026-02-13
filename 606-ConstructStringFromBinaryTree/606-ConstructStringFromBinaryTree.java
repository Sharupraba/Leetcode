// Last updated: 2/13/2026, 9:47:33 AM
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
    public String tree2str(TreeNode root) {
        if (root == null) return "";

        String result = root.val + "";

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if (root.left == null && root.right == null) {
            return result; // no children, just the value
        }

        if (root.right == null) {
            return result + "(" + left + ")"; // only left child
        }

        // has right child (left may or may not be there)
        return result + "(" + left + ")" + "(" + right + ")";
    }
}
