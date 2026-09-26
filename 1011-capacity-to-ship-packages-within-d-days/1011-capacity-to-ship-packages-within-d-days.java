class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
    int minCap = 0;
    int maxCap = 0;
    for (int weight : weights) {

      minCap = Math.max(minCap, weight);
      maxCap += weight;
    }

    // Apply binary search
    while (minCap < maxCap) {
      int mid = minCap + (maxCap - minCap) / 2;

      // Try to ship with "mid" capacity
      int d = 1;
      int sum = 0;
      for (int weight : weights) {
        if (sum + weight > mid) {
          d++;
          sum = 0;
        }
        sum += weight;
      }

      // If more days are required, increase capacity
      if (d > days)
        minCap = mid + 1;
      else
        maxCap = mid;
    }

    return minCap;
    }
}