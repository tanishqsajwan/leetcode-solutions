class Solution {
    public int smallestIndex(int[] nums) {
        int smallest_index = Integer.MAX_VALUE;
        for(int i = 0 ;i < nums.length ; i++){
            if(i == sumofadigitindex(nums[i])){
            smallest_index = i;
            break;
            }
        }
        if(smallest_index == Integer.MAX_VALUE) return -1;
        return smallest_index;
    }

    int sumofadigitindex(int n){
        int sum = 0;
        while(n > 0){
         sum+= n%10;
         n = n/10;
        }
        return sum;
    }
}