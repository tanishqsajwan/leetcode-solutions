class Solution {
    public String reverseWords(String s) {
        if(s.length()<=1) return s;
        s=s.trim();
        String[] arr = s.trim().split("\\s+");
        int j = arr.length -1 ;
        for(int i =  0 ; i< arr.length ; i++){
           if(i<j){
            String temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
        }
        String b ="";
       for(int k = 0 ; k <arr.length ; k++){
       
        if(k!=arr.length-1) {
            b= b + arr[k] + " ";
        }
        else{
             b = b +arr[k];
        }
       }
       return b;
    }
}