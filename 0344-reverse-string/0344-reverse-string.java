class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        reverse(s, i);
    }
    static void reverse(char[] s , int i){
        int l = s.length;
        int j = l-i-1;
        if(i == l/2) return ;
            char temp = s[i];
            s[i]=s[j];
            s[j] = temp;
        reverse(s , i+1);
    }
}