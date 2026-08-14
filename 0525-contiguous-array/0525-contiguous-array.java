class Solution {
    public int findMaxLength(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){if(nums[i]==0) nums[i]= -1;} 
        
        Map<Integer,Integer> freq = new HashMap<>();
        int sum = 0, maxlen = 0;
        freq.put(0,-1);
        for(int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
            if(freq.containsKey(sum)){
                int last = freq.get(sum);
                maxlen = Math.max(maxlen,i-last);
            }
            else freq.put(sum , i);
        }
        return maxlen;
    }
}