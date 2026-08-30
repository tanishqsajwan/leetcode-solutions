class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer , Integer> LIndex = new HashMap<>();
        Set<Integer> not_special = new HashSet<>();

        for(int i = 0 ; i< nums.length ; i++){
            int num = nums[i];

            if(LIndex.containsKey(num)){
                if(LIndex.get(num)!= i-1){
                    not_special.add(num);
                }
            }
            LIndex.put(num,i);
        }
        int count = LIndex.size();
        count  -= not_special.size();

        return count;
    }
}