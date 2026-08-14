class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int sum = 0, maxlen = 0;
        freq.put(0,-1);
        for( int i= 0 ; i < nums.length ; i++ ){
           if(nums[i]==0) sum--;     
           else sum++;    
           if(freq.containsKey(sum)){
            maxlen = Math.max(maxlen , i - freq.get(sum));
           }
           else freq.put(sum , i);
        }
        return maxlen;
    }
}