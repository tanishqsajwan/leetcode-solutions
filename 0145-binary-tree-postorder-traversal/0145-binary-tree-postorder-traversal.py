# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: TreeNode | None) -> list[int]:
        ans=[]
        self.pot(root,ans)
        return ans    
    def pot(self , root , ans)-> list[int]:
        if root == None :
            return
        self.pot(root.left ,ans)
        self.pot(root.right ,ans)
        ans.append(root.val)