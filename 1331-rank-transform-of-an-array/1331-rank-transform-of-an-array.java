class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] cloned = arr.clone();
        Arrays.sort(cloned);
        
        HashMap<Integer , Integer> ls = new HashMap<>();
        int place= 1;
        for(int i : cloned){
            if(!ls.containsKey(i)){
                ls.put( i, place);
                place++;
            }
        }
        int[] ans = new int[arr.length];
        for(int j = 0 ; j < arr.length ; j++){
            ans[j]=ls.get(arr[j]);
        }
        return ans;
    }
}