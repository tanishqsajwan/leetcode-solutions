class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0 ;
        boolean istF = false;
        for(int num : nums){
            xor ^= num ;
            if(xor != 0 ) istF = true;   
        }
        if(xor != 0) return nums.length;
        if(istF) return nums.length -1 ;
        return 0;
    }
}