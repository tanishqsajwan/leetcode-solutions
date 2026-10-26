class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2= new Stack<>();
        for(char a : s.toCharArray()){
            if(a == '#'){
                if(!stack1.isEmpty())
                stack1.pop();
            }
            else stack1.push(a);
        }
        for(char a : t.toCharArray()){
            if(a == '#'){
                 if(!stack2.isEmpty())
                stack2.pop();
            }
            else stack2.push(a);
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while( !stack1.isEmpty() ) sb1.append(stack1.pop());
        while( !stack2.isEmpty() ) sb2.append(stack2.pop()); 
        return sb1.reverse().toString().equals(sb2.reverse().toString());   
    }
}