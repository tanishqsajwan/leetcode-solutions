class Solution {
  public List luckyNumbers (int[][] matrix) {
int n = matrix.length;
int m = matrix[0].length;
int maxOfMin = Integer.MIN_VALUE;

// Find the maximum of the row minimums
for (int i = 0; i < n; i++) {
int minVal = Integer.MAX_VALUE;
for (int j = 0; j < m; j++) {
minVal = Math.min(minVal, matrix[i][j]);
}
maxOfMin = Math.max(maxOfMin, minVal);
}

// Verify if it is the maximum in its column
List result = new ArrayList<>();
for (int j = 0; j < m; j++) {
int colMax = Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
colMax = Math.max(colMax, matrix[i][j]);
}
if (colMax == maxOfMin) {
result.add(colMax);
}
}
return result;
}
}