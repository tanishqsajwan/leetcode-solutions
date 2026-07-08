class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap< Character , Integer > sh= new HashMap<>();
        HashMap< Character , Integer > th= new HashMap<>();
        
        for(int i  = 0  ; i < s.length() ; i++){
            if(sh.containsKey(s.charAt(i))) {
            sh.put(s.charAt(i),sh.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                sh.put(s.charAt(i), 1);
            }
        }

          for(int j  = 0  ; j < t.length() ; j++){
            if(th.containsKey(t.charAt(j))) {
            th.put(t.charAt(j),th.getOrDefault(t.charAt(j),0)+1);
            }
            else{
                th.put(t.charAt(j), 1);
            }
        }

        for(Map.Entry< Character , Integer > e : th.entrySet()){
            Character ch = e.getKey();
            int it = e.getValue();
            if(!sh.containsKey(ch)) return false;

            else if (!sh.get(ch).equals(it)) return false ;
        }
        return true;
    }
}