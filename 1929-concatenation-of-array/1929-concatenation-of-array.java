class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> ln  =  new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            ln.add(nums[i]);
        }

         for(int  l= 0 ; l < nums.length ; l++){
            ln.add(nums[l]);
        }

        int[] ans = new int[ln.size()];
        int k=0;
        for(int j : ln){
            ans[k] = j ; 
            k++;
        }
        return ans;
    }
}