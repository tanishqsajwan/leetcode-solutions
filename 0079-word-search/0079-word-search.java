class Solution {
    public boolean exist(char[][] board, String word) {
        int m= board.length;
        int n = board[0].length;
        for(int row = 0 ; row < m ; row++){
            for(int col = 0 ; col < n ; col++){
              if(board[row][col] == word.charAt(0)){
                boolean found = backtrack(board,row ,col,word ,0);
                if(found) return true;
              }
            }
        }
        return false;
    }
    boolean backtrack(char[][] mat, int r, int c, String word, int wi){
        if(wi == word.length()) return true;
        int row = mat.length;
        int col = mat[0].length;
        if(r < 0 || c < 0 || r >= row || c >= col || mat[r][c] == ' ' || mat[r][c] != word.charAt(wi)) return false;
        char ch = mat[r][c];
        mat[r][c] = ' ' ; 
        if(backtrack(mat, r-1, c, word, wi+1)||
           backtrack(mat, r, c+1, word, wi+1)||
           backtrack(mat, r+1, c, word, wi+1)||
           backtrack(mat, r, c-1, word, wi+1)
        ) return true;
        mat[r][c] = ch;
        return false;
    }
}