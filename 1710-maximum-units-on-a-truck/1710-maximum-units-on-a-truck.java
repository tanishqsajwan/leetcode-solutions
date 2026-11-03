class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.<int[]>comparingInt(row -> row[1]).reversed());
        int total = 0;
        for(int i = 0 ; i < boxTypes.length ; i++){
            if(boxTypes[i][0] <= truckSize){
                truckSize = truckSize - boxTypes[i][0];
                total += boxTypes[i][0]*boxTypes[i][1];
            }
            else{     
                total += truckSize * boxTypes[i][1];
                break;
            }
           
        }   
         return total;
    }
}