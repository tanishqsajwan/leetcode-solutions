class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        Queue<int []> queue = new ArrayDeque<>();
        for(int rowtrav = 0 ; rowtrav < row ; rowtrav++){
            for(int coltrav=0 ; coltrav < column ; coltrav++){
                if(mat[rowtrav][coltrav] == 0){
                    queue.offer(new int[]{rowtrav , coltrav});
                }
                else mat[rowtrav][coltrav] = -1;
            }   
        }
        int[] rowmove = {-1, 1, 0, 0};
        int[] colmove = {0, 0, -1, 1};
        while(!queue.isEmpty()){
            int[] i = queue.poll();
            int moverow = i[0];
            int movecol = i[1];

            for(int l= 0 ; l<4 ; l++){
                int mr = moverow + rowmove[l];
                int mc = movecol + colmove[l];

                if(mr >= 0 && mr < row && mc >=0 && mc <column){
                    if(mat[mr][mc] == -1){
                        mat[mr][mc]=mat[moverow][movecol] + 1;
                        queue.offer(new int[]{mr,mc});
                }
            }
        }
     }
        return mat;
    }
}