class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] a = new int[26];
        int[] b = new int[26];
        ArrayList<Integer> result= new ArrayList<>();
        for(char i:p.toCharArray()){
            a[i-'a']++;
        } 
        for(int j=0; j<s.length(); j++){
        b[s.charAt(j)-'a']++;

        if(j>=p.length()){
            b[s.charAt(j-p.length())-'a']--;
        }
        if(Arrays.equals(a,b)){
            result.add(j-p.length()+1);
        }
        }
        return result;
    }
}