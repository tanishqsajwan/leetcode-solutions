class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }

            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }

        int option1 = first * second * third;
        int option2 = smallest * secondSmallest * first;

        return Math.max(option1, option2);
    }
}