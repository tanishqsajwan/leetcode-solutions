class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas= 0 ,totalcost = 0 ;
        for(int i = 0 ; i < gas.length ; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalgas < totalcost ) return -1;

        int cgas = 0 , ind = 0;
        for(int i = 0 ; i < gas.length ; i++){
            cgas += gas[i] - cost[i];

            if(cgas < 0){
                ind = i+1;
                cgas=0;
            }
        }
        return ind;
    }
}