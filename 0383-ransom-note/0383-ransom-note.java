class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==0|| magazine.length()==0) return false;

        HashMap<Character , Integer> mag=new HashMap<>();
        HashMap<Character , Integer> ran=new HashMap<>();

        for(int i=0 ; i<magazine.length() ; i++){
            if(mag.containsKey(magazine.charAt(i))){
                mag.put(magazine.charAt(i) , mag.getOrDefault(magazine.charAt(i),0)+1);
            }
            else { mag.put(magazine.charAt(i),1);}
        }
           for(int j=0 ; j<ransomNote.length() ; j++){
            if(ran.containsKey(ransomNote.charAt(j))){
                ran.put(ransomNote.charAt(j) , ran.getOrDefault(ransomNote.charAt(j),0)+1);
            }
            else { ran.put(ransomNote.charAt(j),1);}
        }

        for(Map.Entry<Character , Integer> e : ran.entrySet()){
           Integer si = e.getValue();
           char k= e.getKey();
          

          if (!mag.containsKey(k)) return false;

          if (mag.get(k) < si) return false;
        }
        return true;
    }
}