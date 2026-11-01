class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                pq.offer(matrix[i][j]);
            }
        }
        int count = 0;
        int ans=0;
        while(!pq.isEmpty()){
            count++;
            if(count == k){
                ans = pq.peek();
                break;
            }
            pq.poll();
        }
        return ans;
    }
}