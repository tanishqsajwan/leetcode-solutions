class Solution {
    public int numSubarraysWithSumAtMostK(int[] nums, int goal) {
        int start= 0  , sum = 0  , count = 0 , n = nums.length;
        for(int end= 0 ; end<n ; end++){
            sum+=nums[end];
            while(start<=end && sum>goal){
                sum -= nums[start];
                start++;
            }
            count += end - start +1; 
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumAtMostK(nums,goal) - numSubarraysWithSumAtMostK(nums,goal-1);
    }
}