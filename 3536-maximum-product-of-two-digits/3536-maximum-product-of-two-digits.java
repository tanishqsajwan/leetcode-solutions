class Solution {
    public int maxProduct(int n) {
        int largest = -1;
        int secondlar = -1;
        while(n > 0){
             int k = n%10;
             if(k>largest){
                secondlar = largest;
                largest = k;
             }
            else if(k>secondlar) secondlar = k ;

             n=n/10;
        }
         
         return largest *secondlar;
    }
}