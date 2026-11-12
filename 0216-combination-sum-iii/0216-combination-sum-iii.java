class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(0,1 , ans , new ArrayList<>() , k,n);
        return ans;
    }
    void backtrack( int sum ,int index , ArrayList<List<Integer>> ans ,List<Integer> current ,int k ,int n){
        if(sum > n) return ;
        if( current.size() == k ){
            if(sum == n){
                ans.add(new ArrayList<>(current));
            }
            return ;
        }
        for(int i = index ; i <= 9 ; i++){
            current.add(i);
            backtrack(sum+i ,i+1 ,ans,current,k,n);
            current.remove(current.size() - 1);
        }
    }
}