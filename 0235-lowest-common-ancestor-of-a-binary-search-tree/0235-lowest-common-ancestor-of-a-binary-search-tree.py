# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        curr =  root
        if curr == None or curr == p or curr == q :
            return curr
        if p.val < curr.val and q.val < curr.val :
            return self.lowestCommonAncestor(curr.left , p , q)
        if p.val > curr.val and q.val > curr.val :
            return self.lowestCommonAncestor(curr.right , p , q)
        return curr