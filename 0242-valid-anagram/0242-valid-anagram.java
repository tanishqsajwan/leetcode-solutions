class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sfreq = new int[26];
        int[] tfreq = new int[26];
        for(char j : s.toCharArray()) sfreq[j - 'a']++;
        for(char k : t.toCharArray()) tfreq[k - 'a']++;

        return Arrays.equals(sfreq , tfreq)?true:false; 
    }
}