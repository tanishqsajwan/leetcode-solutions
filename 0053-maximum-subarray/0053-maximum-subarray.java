class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int cursum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<n;i++){
            cursum = Math.max(cursum+nums[i],nums[i]);
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}