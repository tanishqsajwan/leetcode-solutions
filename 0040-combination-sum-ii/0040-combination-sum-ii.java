class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, 0, ans, new ArrayList<>(), candidates, target);
        return ans;
     }
    void backtrack(int index, int sum , List<List<Integer>> ans , List<Integer> curr , int[] candidates, int target){
        if(sum > target ) return;
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index ; i < candidates.length ; i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            curr.add(candidates[i]);
            backtrack(i+1, sum+candidates[i], ans, curr, candidates, target);
            curr.remove(curr.size()- 1);
        } 
    } 
}