class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1 ) return 0 ; 
        int peak = Integer.MIN_VALUE ;
        int ind = 0 ; 
     for(int i = 0 ; i < nums.length ; i++){
     if(nums [i]> peak) {
        peak = nums [i]  ;
        ind = i ;

     }
    
    } return ind;
}
}