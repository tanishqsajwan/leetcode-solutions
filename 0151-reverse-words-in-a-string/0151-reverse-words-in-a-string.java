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
       StringBuilder sb = new StringBuilder();
       for(int k = 0 ; k < arr.length ; k++){
       if(k==arr.length-1){
        sb.append(arr[k]);}
        else{sb.append(arr[k]+" ");}
       }
       String b = sb.toString();
       return b; 
    }
}