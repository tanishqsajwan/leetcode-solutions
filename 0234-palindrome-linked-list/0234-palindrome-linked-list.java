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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> seen = new Stack<>();
        ListNode dummy = head;
        while(dummy != null){
            seen.push(dummy);
            dummy = dummy.next;
        }
        ListNode ans = head;
        while(ans!= null){
            if(ans.val != seen.pop().val) return false;
            ans = ans.next;
        }
        return true;
    }
}