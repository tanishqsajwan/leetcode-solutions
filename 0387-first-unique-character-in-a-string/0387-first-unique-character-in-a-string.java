class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0) return -1;

        HashMap<Character , Integer> freq = new HashMap<>();

        for(int i = 0 ; i< s.length() ; i++){
            if(freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i) , freq.getOrDefault(s.charAt(i),0)+1);
             
            }
            else{
                freq.put(s.charAt(i) , 1);
               
            }
        }
      for (int i = 0; i < s.length(); i++) {
    if (freq.get(s.charAt(i)) == 1) {
        return i;
    }
}
        return -1;
    }
}