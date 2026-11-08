class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        combo(0 , digits ,ans ,sb , map);
        return ans;
    }
    void combo(int index,String digits , ArrayList<String> ans , StringBuilder sb ,String[] map ){
        if(index == digits.length()){
            ans.add(sb.toString());
            return ; 
        }
        String letter = map[digits.charAt(index) - '0'];
        for(int i = 0 ; i < letter.length() ; i++){
            Character c = letter.charAt(i);
            sb.append(c);
            combo(index+1,digits , ans , sb , map );

            sb.deleteCharAt(sb.length()-1);
        }
    }
}