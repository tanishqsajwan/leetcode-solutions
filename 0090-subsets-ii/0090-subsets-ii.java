class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>() , 0 , nums);
        return ans;
    }
    void backtrack(List<List<Integer>> ans ,List<Integer> curr , int ind ,int[] nums){
        if(ans.contains(curr)) return;
        ans.add(new ArrayList<>(curr));
        for(int i = ind ; i < nums.length ; i++){
            curr.add(nums[i]);
            backtrack(ans ,curr ,i+1 , nums);
            curr.remove(curr.size() - 1);
        }
    }
}