class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int k = 0 ; k < matrix.length ; k++){
            for(int l = 0 ; l <matrix[k].length ; l++){
                result[l][k] = matrix[k][l];
            }
        }
        return result;
    }
}