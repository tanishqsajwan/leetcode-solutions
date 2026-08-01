class Solution {
    public int countValidPrefixes(String s) {
        int one = 0;
        int zero = 0;
        int  ans = 0 ;
          for(int i = 0 ; i< s.length() ; i++){
              if(s.charAt(i)=='0') zero++ ;
              else  one++;

              if(Math.abs(zero-one)<=1) ans++;
          }
        return ans;
    }
}