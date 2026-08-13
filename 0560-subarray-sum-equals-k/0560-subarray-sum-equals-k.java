class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> freq =new HashMap<>();
        freq.put(0 , 1);
        int prefixSum = 0 , count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            prefixSum += nums[i];
            int needed = prefixSum - k ;
            if(freq.containsKey(needed)) count+= freq.get(needed);
            freq.put(prefixSum,freq.getOrDefault(prefixSum,0)+1);
            
        }
        return count;
 }
}