class Solution {
    public String reverseWords(String s) {
        String[] sk = s.split(" "); 
      
        for(int k = 0 ; k< sk.length ; k++){
         StringBuilder aa = new StringBuilder(sk[k]);
            int i = 0 ;
            int j = aa.length() - 1 ;
             while(i<j){
                char temp = aa.charAt(i);
                aa.setCharAt(i , aa.charAt(j));
                aa.setCharAt(j ,temp);
                i++;
                j--;
                }
                sk[k] = aa.toString();
            }
        StringBuilder sb = new StringBuilder();
        for(int l = 0 ;l<sk.length ; l++){
            if(l != sk.length - 1 ) sb.append(sk[l]+" ");
            else{ sb.append(sk[l]);    }
        }
            
            String m= sb.toString();
            return m;
    }
}