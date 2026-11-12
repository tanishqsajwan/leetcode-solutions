class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(0, 0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
    void backtrack(int index,int sum, int target, int[] candidates, List<List<Integer>> ans, List<Integer> curr){
        if(sum > target){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index ; i < candidates.length ; i++){
           curr.add(candidates[i]);
           backtrack(i, sum + candidates[i] , target, candidates, ans, curr);
           curr.remove(curr.size() - 1);
        }
    }
}