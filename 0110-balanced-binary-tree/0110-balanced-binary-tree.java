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
    private int dfsHeight(TreeNode root) {
        if(root == null) return 0;

        int leftHead = dfsHeight(root.left);
        if(leftHead == -1 ) return -1;
        int rightHead = dfsHeight(root.right);
        if(rightHead == -1) return -1;

        if(Math.abs(leftHead - rightHead) > 1) return -1;
        return Math.max(leftHead, rightHead) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
}