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