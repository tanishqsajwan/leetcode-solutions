class Solution {
    public void reverseString(char[] s) {
        int i = s.length - 1; 

        for(int j= 0 ; j< s.length ;j++){
            if(j!=i){
                if(j>i) break;
                char k = s[j];
                s[j]=s[i];
                s[i]=k;
                i--;
                

            }
        }
    }
}