class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> count= new HashMap();
        int left = 0 ;
        int maxcount = 0 ; 
        for(int right = 0 ; right<fruits.length ;right++){
            int currcount = count.getOrDefault(fruits[right],0);
            count.put(fruits[right] , currcount+1);
            while(count.size()>2){
                int fruitcount = count.get(fruits[left]);
                if(fruitcount==1){
                    count.remove(fruits[left]);
                }
                else{
                    count.put(fruits[left],fruitcount-1);
                }
                left++;
            }
         maxcount= Math.max(maxcount , right-left+1);

        }
       return maxcount;
    }
}