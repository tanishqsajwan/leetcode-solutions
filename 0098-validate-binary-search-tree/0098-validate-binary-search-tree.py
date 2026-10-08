# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: TreeNode | None) -> bool:
        return self.validate(root , -math.inf , math.inf)
    def validate(self , root , min , max) -> bool:
        if root == None :
            return True
        if root.val <= min or root.val >= max :
            return False
        return self.validate(root.left , min , root.val) and self.validate(root.right , root.val ,max) 
