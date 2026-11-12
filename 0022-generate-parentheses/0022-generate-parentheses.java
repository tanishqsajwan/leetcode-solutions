class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> ans = new ArrayList<>();
         parenthesis("" , n , ans);
         return ans;
    }
    void parenthesis(String valid , int n , List<String> ans){
        if(valid.length() == 2*n){
            if(isValid(valid)){
                ans.add(valid);
            }
             return;
        }
        parenthesis(valid+"(" , n , ans);
        parenthesis(valid+")", n, ans);
    }
    boolean isValid(String s){
        int balanced = 0;
        for(char ch : s.toCharArray()){
            if(ch =='(') balanced++;
            else balanced--;
             if (balanced < 0) {
                return false;
            }
        }
        return balanced == 0;
    }
}