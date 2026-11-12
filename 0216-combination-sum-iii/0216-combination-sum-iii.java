class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(1 , ans , new ArrayList<>() , k,n);
        return ans;
    }
    void backtrack(int index , ArrayList<List<Integer>> ans ,List<Integer> current ,int k ,int n){
        if( current.size() == k ){
            int sum = 0;
            for(int i = 0 ; i < current.size() ; i++){
            sum += current.get(i);
            }
            if(sum == n){
                ans.add(new ArrayList<>(current));
                return ;
            }
            else return ;
        }
        for(int i = index ; i <= 9 ; i++){
            current.add(i);
            backtrack(i+1 ,ans,current,k,n);
            current.remove(current.size() - 1);
        }
    }
}