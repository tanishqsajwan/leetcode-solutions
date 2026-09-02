/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     HashSet<ListNode> seen = new HashSet<>();
     ListNode skipA = headA;
     ListNode skipB = headB;

     while(headA != null ){
        seen.add(headA);
        headA = headA.next;
     }   
     while(headB!= null){
        if(seen.contains(headB)){
            return headB;
        }
        else{
            seen.add(headB);
            headB = headB.next;
        }
     }
     return null;
    }
}