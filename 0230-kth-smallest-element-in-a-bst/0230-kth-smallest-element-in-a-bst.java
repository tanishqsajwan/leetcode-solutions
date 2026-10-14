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
    int pos = 0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode leaf = inOrder(root , k);
        if(leaf == null) return -1;
        return leaf.val;
    }
    private TreeNode inOrder(TreeNode root , int k){
        if ( root == null) return root;
        TreeNode left = inOrder(root.left , k);
        if(left != null){
            return left ;
        }
        pos++;
        if(pos == k) return root;
        return inOrder(root.right, k);

    }
}