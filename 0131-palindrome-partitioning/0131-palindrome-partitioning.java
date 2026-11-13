class Solution {
   List<List<String>> ans = new ArrayList<>();
   int n;
    public List<List<String>> partition(String s) {
        n= s.length();
        backtrack(new ArrayList<>(), s, 0);
        return ans;
    }
    boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    void backtrack(List<String> curr, String s, int index){
        if(index == n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index; i < n ; i++){
            if(isPalindrome(s, index, i)){
                curr.add(s.substring(index, i+1));

                backtrack(curr, s, i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
}