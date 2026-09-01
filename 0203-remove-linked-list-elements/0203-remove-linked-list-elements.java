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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0 , head);
        ListNode ans_1 = ans ;

        while(ans_1 != null){

         while(ans_1.next != null && ans_1.next.val == val) ans_1.next = ans_1.next.next;

         ans_1 = ans_1.next;
        }
        return ans.next;
    }
}