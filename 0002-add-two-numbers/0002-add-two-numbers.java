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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0 ;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = 0;
            int val2 = 0;
            if(l1 != null){
                val1 = l1.val;
            } else val1 = 0;

            
            if(l2 != null){
                val2 = l2.val;
            } else val2 = 0;
            
            int sum = val1 + val2 + carry;
              
            ListNode d = new ListNode(sum%10);
            ans.next = d;
            carry = sum/10;
            
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
            ans = ans.next;
        }
        return dummy.next;
    }
}