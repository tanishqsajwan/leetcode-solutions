class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points , (x,y)-> Integer.compare(x[1],y[1]));
        int count =1 ; 
        int pos = 0 ; 
        for(int i =1 ; i < points.length ; i++){
            if(points[i][0] > points[pos][1]){
                pos = i ; 
                count++;
            }
        }
        return count;
    }
}