class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Main diagonal:
            // row increases and column also increases
            sum += mat[i][i];

            // Secondary diagonal:
            // row = i
            // column = n - 1 - i
            sum += mat[i][n - 1 - i];
        }

        // If n is odd, the center element was added twice.
        // Remove it once.
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}