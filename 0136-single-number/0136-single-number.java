class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
       int  ans = 0;
        for(Map.Entry<Integer , Integer> freq_two : freq.entrySet()){
            int g= freq_two.getValue();
            int k = freq_two.getKey();
            if(g==1) ans = k;
        }
        return ans;
    }
}