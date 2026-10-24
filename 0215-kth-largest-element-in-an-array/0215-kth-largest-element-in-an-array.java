class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        for(int num: nums) queue.offer(num);
        while(!queue.isEmpty()){
        int largest = queue.poll();
        i++;
        if(i == k) return largest;
        }
        return -1;
    }
}