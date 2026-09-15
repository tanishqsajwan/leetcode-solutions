class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                sk.push(s.charAt(i));
            }
            
          else {
            if(sk.isEmpty()) return false;
           if (s.charAt(i)=='}'&&sk.peek()=='{'||s.charAt(i)==']'&&sk.peek()=='['||s.charAt(i)==')'&&sk.peek()=='('){
            sk.pop();
          } else return false;
          }
         

        } 
        return sk.isEmpty();
    }
}