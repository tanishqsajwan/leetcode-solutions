class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int count = 1 ;
        int previous = 0 ; 
        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] >= intervals[previous][1]){
                previous = i ; 
                count++;
            }
        }
        return intervals.length - count;
    }
}