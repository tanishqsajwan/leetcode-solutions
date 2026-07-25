import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        long windowSum = 0;
        long maximumSum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];

            frequency.put(
                nums[i],
                frequency.getOrDefault(nums[i], 0) + 1
            );
        }

        // Check the first window
        if (frequency.size() == k) {
            maximumSum = windowSum;
        }

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            int outgoing = nums[i - k];
            int incoming = nums[i];

            // Remove outgoing element from the sum
            windowSum -= outgoing;

            // Decrease outgoing element frequency
            frequency.put(outgoing, frequency.get(outgoing) - 1);

            // Remove the key completely when frequency becomes 0
            if (frequency.get(outgoing) == 0) {
                frequency.remove(outgoing);
            }

            // Add incoming element
            windowSum += incoming;

            frequency.put(
                incoming,
                frequency.getOrDefault(incoming, 0) + 1
            );

            // Valid only when all k elements are distinct
            if (frequency.size() == k) {
                maximumSum = Math.max(maximumSum, windowSum);
            }
        }

        return maximumSum;
    }
}