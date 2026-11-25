class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid , i , j);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid , int i , int j){
        Stack<int[]> st = new Stack<>();
        grid[i][j] = 'V';
        st.push(new int[]{i,j});
        int[] mr = {-1, 1, 0, 0};
        int[] mc = {0, 0, -1, 1};
        while(!st.isEmpty()){
            int[] m =st.pop();
            int r = m[0];
            int c = m[1];
            for(int p = 0 ; p < 4 ; p++){
                int tpr = r + mr[p];
                int tpc = c + mc[p];
                if(tpr >= 0 && tpr < grid.length &&
                   tpc >= 0 && tpc < grid[0].length){
                    if(grid[tpr][tpc] == '1'){
                        grid[tpr][tpc] = 'V';
                        st.push(new int[]{tpr,tpc});
                    }
                } 
            }
        }
    }
}