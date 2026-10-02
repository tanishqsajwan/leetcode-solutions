# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode | None) -> list[int]:
        ans=[]
        self.preot(root , ans)
        return ans
    def preot(self , root ,ans)-> list[int]:
        if root == None:
            return
        ans.append(root.val)
        self.preot(root.left , ans)
        self.preot(root.right , ans)
        