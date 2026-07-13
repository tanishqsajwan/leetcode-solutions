class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}