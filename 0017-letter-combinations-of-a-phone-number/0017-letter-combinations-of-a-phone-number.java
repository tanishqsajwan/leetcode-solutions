class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0) return new ArrayList<>();
        String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();
        f(0, digits , ans ,sb ,map);       
        return ans;
    }
    void f(int index ,String digits, ArrayList<String> res, StringBuilder sb, String[] map ){
        if(index == digits.length()){
            res.add(sb.toString());
            return ;
        }
        String letter = map[digits.charAt(index) - '0'];
        for(int i = 0 ; i < letter.length() ; i++){
            Character c = letter.charAt(i);
            sb.append(c);
            f(index+1 , digits , res ,sb ,map);

            sb.deleteCharAt(sb.length()-1) ;
        }
    }
}