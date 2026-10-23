class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) ans.add(stone);
        while(ans.size()>1){
            int x = ans.poll();
            int y = ans.poll();
            if(x != y) ans.offer(x-y);
        }
        return ans.isEmpty() ? 0 : ans.poll();
    }
}