class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxel = 0;
        int minim = 0;
        for(int max = 0; max < nums.length ; max++){
             maxel = Math.max(maxel , nums[max]);
             minim = nums[max];
            for(int min = max; min < nums.length ; min++){
         minim = Math.min(minim , nums[min]);
              
               }
 if( maxel - minim <= k ) return max ;
         
        }
        return -1;
    }
}