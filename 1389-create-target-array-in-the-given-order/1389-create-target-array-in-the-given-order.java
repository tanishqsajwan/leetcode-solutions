class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targate = new ArrayList<>();
        int j = 0 ; 
        for(int i : index ){
            targate.add(i , nums[j]);
            j++;
        }
       int[] ans = new int[index.length];
       int l = 0 ;
        for(int k : targate){
         ans[l] = k ;
         l++;
        }
        return ans ; 
    }
}