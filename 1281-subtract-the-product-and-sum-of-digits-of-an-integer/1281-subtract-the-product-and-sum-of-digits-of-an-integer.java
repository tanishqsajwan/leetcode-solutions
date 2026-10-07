class Solution {
    public int subtractProductAndSum(int n) {
        int a= 1;
        int b = 0;
        while(n != 0){
            int k = n % 10;
            a *= k;
            b += k;

            n = n / 10;
        }
        return a-b;
    }
}