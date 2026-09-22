class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ; 
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans= new int[n - k +1];
        
        for(int i = 0 ; i < k ; i++){
            while(!deque.isEmpty()&& nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        ans[0] = nums[deque.peekFirst()];
        for(int i = k ; i< n ; i++){
            if(deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
             while(!deque.isEmpty()&& nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}