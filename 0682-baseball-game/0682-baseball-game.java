class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack();
        for(String op : operations){
            if(op.equals("C")){
                if(!st.isEmpty()) st.pop();
            }
            else if(op.equals("+")){
                if(st.size() >= 2){
                    int i = st.pop();
                    int j = st.peek();
                    st.push(i);
                    st.push(i+j);
                }
            }
            else if(op.equals("D")){
                if(!st.isEmpty()) st.push(st.peek()*2);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!st.isEmpty()) sum += st.pop();
        return sum;
    }
}