class Solution {
    public int largestInteger(int[] nums, int k) {

        // Counts how many WINDOWS contain each number.
        Map<Integer, Integer> windowCount = new HashMap<>();

        // Counts numbers inside the CURRENT window.
        Map<Integer, Integer> windowFreq = new HashMap<>();

        // Build the first window.
        for (int i = 0; i < k; i++) {
            windowFreq.put(nums[i],
                    windowFreq.getOrDefault(nums[i], 0) + 1);
        }

        // This window contains each DISTINCT number once.
        for (int num : windowFreq.keySet()) {
            windowCount.put(num,
                    windowCount.getOrDefault(num, 0) + 1);
        }

        // Slide the window.
        for (int i = k; i < nums.length; i++) {

            // Add incoming number.
            windowFreq.put(nums[i],
                    windowFreq.getOrDefault(nums[i], 0) + 1);

            // Remove outgoing number.
            int outgoing = nums[i - k];

            windowFreq.put(outgoing,
                    windowFreq.get(outgoing) - 1);

            // If frequency becomes 0, it is no longer
            // present in the current window.
            if (windowFreq.get(outgoing) == 0) {
                windowFreq.remove(outgoing);
            }

            // Count each DISTINCT number in this window ONCE.
            for (int num : windowFreq.keySet()) {
                windowCount.put(num,
                        windowCount.getOrDefault(num, 0) + 1);
            }
        }

        int answer = -1;

        // We need numbers appearing in exactly ONE window.
        for (Map.Entry<Integer, Integer> entry : windowCount.entrySet()) {

            int num = entry.getKey();
            int count = entry.getValue();

            if (count == 1) {
                answer = Math.max(answer, num);
            }
        }

        return answer;
    }
}