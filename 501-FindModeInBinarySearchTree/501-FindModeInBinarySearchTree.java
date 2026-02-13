// Last updated: 2/13/2026, 9:47:37 AM
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
    private Integer prev = null;
    private int maxcount = 0;
    private int count = 0;
    List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);

        if (prev != null) {
            if (node.val == prev) {
                count++;
            } else {
                count = 1;
            }
        } else {
            count = 1;
        }

        if (count == maxcount) {
            modes.add(node.val);
        } else if (count > maxcount) {
            modes.clear();
            modes.add(node.val);
            maxcount = count;
        }

        prev = node.val;

        inOrder(node.right);
    }
}