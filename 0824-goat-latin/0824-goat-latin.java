class Solution {
    public String toGoatLatin(String sentence) {
        String[] s= sentence.split(" ");
        String suff = "a";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length ; i++){
            String k = s[i];
         
            if(isVowel(k.charAt(0))){
                sb.append(k.substring(0));
                
                if(i!=s.length-1)    sb.append("ma"+suff+' ');
                else { sb.append("ma"+suff); }
             }
            else{
                sb.append(k.substring(1));
                 if (i!=s.length-1)  sb.append(k.substring(0,1) + "ma" + suff + ' ');
                 else {sb.append(k.substring(0,1) + "ma" + suff);}
            }
            suff +="a";
            }
           return sb.toString();
    }
            private boolean isVowel(char c){
            c = Character.toLowerCase(c);
            return c == 'a' ||c == 'e' ||c == 'i' || c == 'o' ||c == 'u';
        
        }
       
    }

