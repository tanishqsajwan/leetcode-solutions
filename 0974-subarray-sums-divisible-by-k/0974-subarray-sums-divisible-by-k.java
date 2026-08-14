class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int prefixSum=0;
        int count = 0;
        for(int i : nums){
            prefixSum += i ;
            int mod =prefixSum%k ;
            if(mod < 0 )  mod=mod+k;
            if(freq.containsKey(mod)){
                count += freq.get(mod);
               
            } 
            freq.put(mod , freq.getOrDefault(mod , 0)+1);
        }
        return count;
    }
}