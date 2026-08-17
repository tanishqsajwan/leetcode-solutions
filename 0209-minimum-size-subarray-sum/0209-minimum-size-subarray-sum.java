class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
         int sum= 0 ; 
         int length = Integer.MAX_VALUE;
         for(int right = 0 ; right < nums.length ; right++){
            sum +=nums[right];
            while(sum>=target){
                 length = Math.min(length ,right-left+1);
                sum -= nums[left];
                left++;
            }
           
         }
          if (length == Integer.MAX_VALUE) {
            return 0;
        }
         return length;
    }
}