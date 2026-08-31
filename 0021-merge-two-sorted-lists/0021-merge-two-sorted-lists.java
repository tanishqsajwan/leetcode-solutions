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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rem = new ListNode(Integer.MIN_VALUE);
        ListNode curr = rem ; 

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                rem.next =list1;
                list1 = list1.next ;
            }
            else{
                rem.next = list2;
                list2 = list2.next;
            }
            rem = rem.next;
        }
         if(list1 == null) rem.next = list2;
        else if(list2 == null) rem.next = list1;

         return curr.next;
    }
}