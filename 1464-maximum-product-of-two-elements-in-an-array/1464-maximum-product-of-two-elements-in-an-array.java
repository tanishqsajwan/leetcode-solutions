class Solution {
    public int maxProduct(int[] nums) {
        int largest= Integer.MIN_VALUE;
        int ndlargest= Integer.MIN_VALUE;
        for(int i= 0 ; i< nums.length ;i++){
            if(nums[i]>largest){
                ndlargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>ndlargest){
                ndlargest = nums[i];
            }
        }
        return (largest-1)*(ndlargest-1);
    }
}