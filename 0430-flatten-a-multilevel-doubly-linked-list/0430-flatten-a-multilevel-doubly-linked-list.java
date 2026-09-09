/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Map<Integer , Node > last = new HashMap<>();
         int i = 0 ;
        Node dummy = head;
        while(dummy!=null){
           
            if(dummy.child != null){
                i++;
                last.put(i , dummy.next);
                  dummy.next = dummy.child;
                dummy.child.prev = dummy;
                dummy.child = null;
            }

            while(dummy.next == null && last.size()!= 0){
                  Node originalNext = last.get(i);

                dummy.next = originalNext;

                if (originalNext != null) {
                    originalNext.prev = dummy;
                }

                last.remove(i);
                i--;
                
            }
            dummy = dummy.next;
        }
        return head;
        
    }
}