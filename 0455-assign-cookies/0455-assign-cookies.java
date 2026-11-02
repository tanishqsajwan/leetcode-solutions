class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int glen = 0; 
        int count = 0;
        for(int slen = 0 ; slen < s.length ; slen++){
            if(glen == g.length) break;

            if(s[slen]>= g[glen]) 
            {count++;
            glen++;}
            
        }
        return count;
    }
}