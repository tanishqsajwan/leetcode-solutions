# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode | None) -> ListNode | None:
        if head is None:
            return None
        if head.next is None :
            return head
        
        prenode = None
        currnode = head

        while currnode is not None:
            nextnode = currnode.next
            currnode.next = prenode
            prenode = currnode
            currnode = nextnode
        
        return prenode
              
        