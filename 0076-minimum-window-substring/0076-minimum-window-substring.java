class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char c: t.toCharArray()){
            freq[c]++;
        }
        int left= 0 ;
        int count = t.length();
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0 ; right<s.length() ; right++){
            if(freq[s.charAt(right)]>0) count--;
            freq[s.charAt(right)]--;
            while(count == 0 ){
              if(right-left+1<minLength) {
                minLength = right-left+1;
                 start = left;
              }
              freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }
         return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}