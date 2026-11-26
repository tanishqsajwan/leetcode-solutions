class Solution {
    public int area = 0;
    public int maxAreaOfIsland(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    int maxarea = 0;
    for(int i = 0 ; i < row ; i++){
        for(int j = 0 ; j < col ; j++){
            if(grid[i][j] == 1 ){
                 area = 0;
                dfs(grid ,i ,j ,row, col);
                maxarea = Math.max(area , maxarea);
            }
        }
    }
    return maxarea;
    }
    void dfs( int[][] grid, int i, int j , int row , int col){
        if(!isValid(i,j,row,col)) return ;
        if(grid[i][j] == 0) return;
        area++;
        grid[i][j]=0;
        dfs( grid ,i+1 , j , row , col);
        dfs(grid ,i-1 , j , row , col);
        dfs( grid ,i , j+1 , row , col);
        dfs(grid ,i , j-1 , row , col);
    }
    boolean isValid(int i , int j , int row , int col){
        if(i >= 0 && i < row && j >= 0 && j < col){
            return true;
        }
        else return false;
    }
}
