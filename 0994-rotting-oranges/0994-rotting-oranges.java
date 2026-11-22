class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int []> qu = new ArrayDeque<>();
        int fresh = 0 ;

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(grid[i][j] == 1) fresh++;

                else if(grid[i][j] == 2){
                qu.offer(new int[]{i,j});
                }
            }
        }

        if( fresh == 0 ) return  0 ;
        int[] dr = {-1 , 1 , 0 , 0};
        int[] dc = {0 , 0 , -1 , 1};
        int time = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            boolean didanyturnrotten = false;
            for(int i = 0 ; i < size ; i++){
                int[] cell = qu.poll();
                int dr2 = cell[0];
                int dc2 = cell[1];
                for(int j = 0 ; j < 4 ; j++){
                    int cr = dr2 + dr[j];
                    int cc = dc2 + dc[j];

                    if(cr >=0 && cr < r && cc >=0 && cc < c){
                        if( grid[cr][cc] == 1 ){
                            grid[cr][cc] = 2;
                            fresh--;
                            qu.offer(new int[]{cr,cc});
                            didanyturnrotten = true;
                        }
                    } 
                }
            }
            if(didanyturnrotten){
                time++;
            }
        }
        return  fresh == 0 ? time : -1;
    }
}