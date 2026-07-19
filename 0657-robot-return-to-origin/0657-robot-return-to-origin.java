class Solution {
    public boolean judgeCircle(String moves) {
        int ra=0;
        int la=0;
        int ua=0;
        int da=0;
        int cons=0;
        for(int i =0 ; i<moves.length() ; i++){
           char ch = moves.charAt(i);

            if(ch=='R') ra++;
            if(ch=='L') la++;
            if(ch=='U') ua++;
            if(ch=='D') da++;

          
        }

        if(ra == la && ua == da) return true;
        return false;
    }
}