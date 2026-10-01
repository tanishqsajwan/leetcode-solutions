# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode | None) -> ListNode | None:
        return self.reverse(head, None)
    def reverse(self , curr: ListNode | None , prev: ListNode | None) -> ListNode:
       if curr == None:
         return prev
       currnext = curr.next
       curr.next = prev

       return self.reverse(currnext , curr)