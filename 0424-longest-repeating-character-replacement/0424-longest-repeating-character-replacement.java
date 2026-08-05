class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int window = 0 ;
        int maxfeq = 0 ;
        for(int right= 0 ;right<s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxfeq = Math.max(maxfeq, freq[s.charAt(right) - 'A']);
            int windowlength= right-left+1;

            if(windowlength - maxfeq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windowlength= right-left+1;
            window = Math.max(window , windowlength);
        }
        return window;
    }
}