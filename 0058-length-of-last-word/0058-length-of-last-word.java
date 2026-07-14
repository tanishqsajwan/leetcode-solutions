class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i = s.lastIndexOf(" ");
        int count = 0 ;
        for(int j = i+1 ; j < s.length() ; j++) {
            count++;
        }
        return count;
    }
}