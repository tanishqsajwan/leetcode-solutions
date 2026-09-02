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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next =head;
        ListNode one = dummy;
        ListNode two = dummy;
        for(int i = 0 ; i < n ; i++){
        two = two.next;
        }

        while(two.next != null){
            one = one.next;
            two = two.next;
        }
        one.next = one.next.next;
        return dummy.next;
    }
}