class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x, map.getOrDefault(x,0)+1);
            }
            else{
                map.put(x,1);
            }
        }
    int max = 0 ; 
    int key = 0 ; 

    for(Map.Entry<Integer , Integer> e :map.entrySet()){
        if(e.getValue()>max){
            max = e.getValue();
            key = e.getKey();
        }
    }
    return key;
    }
}