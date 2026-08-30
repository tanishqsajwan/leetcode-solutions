class Solution {
    public int addDigits(int num) {
        while(num>=10){ num = single(num);}
        return num;
    }
    private int single(int k){
        int n = 0 ;
        while( k > 0 ){
            n += k%10 ;
            k = k/10;
        }
        return n;
    }
}