class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices); 
        Arrays.sort(discounts);
        int i = discounts.length-1;
        int j = prices.length-1;
        double sum=0.0;
        while(j>=0){
            if(i>=0){
                sum+=dispi(prices[j],discounts[i]);
                i--;
            }
            else sum+=prices[j];
            j--;
        }
        return sum;
    }
    public static double dispi(int k , int l){
        double v = (k*(100.0-l))/100.0;

        return v;
    }
}