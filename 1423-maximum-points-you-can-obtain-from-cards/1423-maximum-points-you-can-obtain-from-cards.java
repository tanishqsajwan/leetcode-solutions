class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int sum=0;
        for(int i = 0 ; i< k ; i++){
            lsum += cardPoints[i];
        }
        sum=lsum;
        int rsum = 0 ; 
        int r=cardPoints.length-1;

        for(int i = k-1 ; i >=0 ; i--){
            lsum = lsum-cardPoints[i];
            rsum = rsum+cardPoints[r];
            r--;
            sum=Math.max(sum,lsum+rsum);
        }
        return  sum;
    }
}