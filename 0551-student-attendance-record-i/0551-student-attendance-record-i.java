class Solution {
    public boolean checkRecord(String s) {
        if(s.length()==0) return false;
        int abs = 0 ; 
        int lat = 0 ;

        for(int i = 0 ; i< s.length() ; i++){
            if(String.valueOf(s.charAt(i)).equals("A")){
                abs++;
            }
             if(abs>=2) return false;

        }
      
         for(int i = 0 ; i< s.length() ; i++){
            if(String.valueOf(s.charAt(i)).equals("L")){
                lat++;
            }
            else{
                lat = 0;
            } if(lat>=3) return false;
        }
       
 
        return true;
    }
}