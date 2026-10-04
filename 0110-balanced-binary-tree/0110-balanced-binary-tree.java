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
    public boolean isBalanced(TreeNode root) {
        int height = getheight(root);
        return (height!= -1);
    }
    private int getheight(TreeNode root){
        if(root == null) return 0;

        int leftsubTree = getheight(root.left);
        int rightsubTree = getheight(root.right);
        if(leftsubTree == -1 || rightsubTree == -1) return -1;
        if(Math.abs(leftsubTree-rightsubTree) > 1) return -1;

        return 1+ Math.max(leftsubTree ,rightsubTree);
    }
}