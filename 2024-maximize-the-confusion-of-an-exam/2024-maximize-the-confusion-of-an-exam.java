class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int l = 0;
        int maxf = 0;
        int result = 0;
        int n = s.length();
        int[] count = new int[26];
        
        for (int r = 0; r < n; r++) {
            maxf = Math.max(maxf, ++count[s.charAt(r) - 'A']);
            
            while (r - l + 1 > maxf + k) {
                --count[s.charAt(l++) - 'A'];
            }
            
            result = Math.max(result, r - l + 1);
        }
        
        return result;
    }
}