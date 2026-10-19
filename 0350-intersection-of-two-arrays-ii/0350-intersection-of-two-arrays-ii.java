class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        HashMap<Integer, Integer> hash2 = new HashMap<>();
        for (int i : nums1)
            hash1.put(i, hash1.getOrDefault(i, 0) + 1);
        for (int i : nums2)
            hash2.put(i, hash2.getOrDefault(i, 0) + 1);

        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> ans : hash1.entrySet()) {
            int k = ans.getKey();
            if (hash2.containsKey(k)) {
                int count = Math.min(ans.getValue(), hash2.get(k));
                for (int i = 0; i < count; i++)
                    res.add(k);
            }
        }

        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            a[i] = res.get(i);
        return a;
    }
}   