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
    int maxi = Integer.MIN_VALUE;
    private int maxPathSumHelper(TreeNode node) {
        if(node == null) return 0;

        int leftSum = Math.max(0, maxPathSumHelper(node.left));
        int rightSum = Math.max(0, maxPathSumHelper(node.right));

        maxi = Math.max(maxi, node.val + leftSum + rightSum);
        return node.val + Math.max(leftSum ,rightSum);
    }
    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return maxi;
    }
}