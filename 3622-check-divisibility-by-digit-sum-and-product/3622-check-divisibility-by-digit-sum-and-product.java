class Solution {
    public boolean checkDivisibility(int n) {
        if(n % productAndSum(n)==0) return true;
        return false;
    }

 public static int productAndSum(int n){
    int sum =0;
    int product = 1 ;
    while(n>0){
        int k = n%10;
        sum += k ;
        product *= k ;

        n= n/10;
    }
    return sum + product;
 }
}