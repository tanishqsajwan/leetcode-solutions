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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        pot(root , ans);
        return ans;
    }
    private void pot(TreeNode root , ArrayList<Integer> ans){
        if (root == null) return;
        pot(root.left ,ans);
        pot(root.right ,ans);
        ans.add(root.val);
    }
}