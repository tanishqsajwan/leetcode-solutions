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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode leftpre = dummy;
        ListNode current =head;

        for(int i = 0 ; i < left-1 ; i++){
            leftpre = leftpre.next;
            current = current.next;
        }

        ListNode prev = null;
        ListNode sublisthead = current;

        for(int i = 0 ; i<= right - left ; i++){
            ListNode nextp = current.next;
            current.next = prev;
            prev = current;
            current = nextp;
        }
        leftpre.next = prev;
        sublisthead.next = current;

        return dummy.next;
    }
}