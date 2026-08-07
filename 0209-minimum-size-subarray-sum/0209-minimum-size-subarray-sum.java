class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // While current window satisfies the condition,
            // try to make it smaller
            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                // Remove leftmost element
                sum -= nums[left];

                // Shrink window
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}