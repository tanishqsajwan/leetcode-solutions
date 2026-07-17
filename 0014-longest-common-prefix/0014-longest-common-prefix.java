class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = strs[0].length();

        // Find the length of the shortest string
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        // Compare each character position
        for (int j = 0; j < min; j++) {

            char ch = strs[0].charAt(j);

            // Compare with every other string
            for (int i = 1; i < strs.length; i++) {

                if (strs[i].charAt(j) != ch) {
                    return strs[0].substring(0, j);
                }
            }
        }

        return strs[0].substring(0, min);
    }
}