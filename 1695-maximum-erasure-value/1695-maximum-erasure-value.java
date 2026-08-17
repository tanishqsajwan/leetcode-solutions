class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        int left = 0 ;
        int score = 0 ;
        int max_score=0 ;
        for(int right = 0 ; right < nums.length ; right++){
            score+=nums[right];
            freq.put(nums[right] , freq.getOrDefault(nums[right],0)+1);
            while(freq.get(nums[right])>1){
                score -=nums[left];
                freq.put(nums[left],freq.getOrDefault(nums[left],0)-1);
                if(freq.get(nums[left])==0) freq.remove(nums[left]);
                left++;
            }
            max_score= Math.max(max_score , score);
        }
        return max_score;
    }
}