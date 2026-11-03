class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            nums[i] = nums[nums.length-1] - nums[i];
            sum += nums[i] ; 
        }
        return sum;
    }
}