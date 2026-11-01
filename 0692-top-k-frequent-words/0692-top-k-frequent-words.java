class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < words.length ; i++){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> ans = new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
                                    if(!a.getValue().equals(b.getValue())){
                                        return b.getValue() - a.getValue();
                                    }
                                    return a.getKey().compareTo(b.getKey());
     });
        for(Map.Entry<String,Integer> m : map.entrySet()){
         pq.offer(m);
        }
        int count=0;
        while(!pq.isEmpty()){
        if(count == k) break;
        ans.add(pq.poll().getKey());
        count++;
        }
        return ans;
    } 
}
