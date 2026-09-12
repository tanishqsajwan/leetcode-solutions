class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // STEP 1: Transpose the matrix
        // Swap matrix[i][j] with matrix[j][i]
        //
        // We only need to visit the upper-right half.
        // That's why j starts from i + 1.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // STEP 2: Reverse every row
        //
        // After transposing, reversing each row
        // gives a 90° clockwise rotation.
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}