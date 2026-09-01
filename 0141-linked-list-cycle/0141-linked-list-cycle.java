/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      Set<ListNode> seen = new HashSet<>();
      ListNode cur = head ;
      while(cur != null){
        if(seen.contains(cur)){
        cur = cur.next;
        return true;
        }
        else{
            seen.add(cur);
            cur = cur.next;
        }
      }
      return false;
    }
}