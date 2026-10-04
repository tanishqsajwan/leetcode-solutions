class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character ,Integer > shash = new HashMap<>();
        Map<Character ,Integer > thash = new HashMap<>();
        for(char j : s.toCharArray()) shash.put(j , shash.getOrDefault(j,0)+1);
        for(char k : t.toCharArray()) thash.put(k , thash.getOrDefault(k,0)+1);

        return shash.equals(thash); 
    }
}