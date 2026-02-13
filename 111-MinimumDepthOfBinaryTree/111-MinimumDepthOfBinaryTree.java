// Last updated: 2/13/2026, 9:48:26 AM
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
    public int minDepth(TreeNode root) {
        if (root == null)
        return 0;
        if (root.left==null)// if left child is null then we have to recursively traverse the right till depth 
        return 1 + minDepth(root.right);
        if ( root. right == null)// if right child is null then we have to completely traverse left child 
        return 1 + minDepth(root.left);
         return 1+ Math.min(minDepth(root.right),minDepth(root.left));// comparing the depth of both using Math.min function and returning the minimum elelment 

    }
    
    }
