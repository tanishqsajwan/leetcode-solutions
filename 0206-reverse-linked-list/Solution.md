# Beats 100% (Recurssive + Iterative method)||206. Reverse Linked List

(Recurssive method)-->
![Screenshot 2026-10-01 095328.png](https://assets.leetcode.com/users/images/6d855919-64a6-49a0-83a2-ea6b3722a05c_1790828633.4990423.png)
# Code
```java []
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head , null);
    }
    private ListNode reverse(ListNode curr , ListNode prev){
        if( curr == null ) return prev;
        ListNode currnext = curr.next;
        curr.next = prev;

        return reverse(currnext, curr);
    }
}
```
```python3 []
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
```
(Iterative method) -->
![Screenshot 2026-09-27 175442.png](https://assets.leetcode.com/users/images/e23bb8c9-0731-455b-a7cf-dcb68b698203_1790511912.4776213.png)

# Code
```python3 []
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
                  
```
```java []
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      if(head == null) return null;
      if(head.next == null) return head;
        

        ListNode prenode = null;
        ListNode currnode = head;
        while(currnode != null){
            ListNode nextnode = currnode.next ;
            currnode.next = prenode;
            prenode = currnode;
            currnode = nextnode;
        }
        head = prenode;
        return head;
    }
}
```
