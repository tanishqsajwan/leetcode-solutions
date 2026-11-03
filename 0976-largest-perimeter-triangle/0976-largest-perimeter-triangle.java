class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = 0 ;
        for(int i = nums.length-1 ; i >=2 ; i--){
        if(nums[i]+nums[i-1]>nums[i-2] && nums[i-1]+nums[i-2]>nums[i] && nums[i-2]+nums[i]>nums[i-1]){
            max= Math.max(max, nums[i]+nums[i-1]+nums[i-2]);
        }
        }
        return max;
    }
}