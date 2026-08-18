class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0 ; 
        for(int num : nums) total += num;
          int target = (int)(total % p);
          if(target == 0 ) return 0;
          Map<Integer , Integer> map = new HashMap<>();
          map.put(0,-1);
     long prefix  =0 ;
     int  answer = nums.length;
     for(int i = 0; i< nums.length ; i++){
        prefix += nums[i];
        int current = (int)(prefix % p);
          int needed = (current - target + p) % p;
        
       if (map.containsKey(needed)) {
                answer = Math.min(
                    answer,
                    i - map.get(needed)
                );
            }   map.put(current, i);
        }

 return answer == nums.length ? -1 : answer;
    }
}