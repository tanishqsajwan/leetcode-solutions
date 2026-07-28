class Solution {
    public String smallestPalindrome(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (int i = 1; i < c.length; i++) {

            if (c[i - 1] == c[i]) {
                left.append(c[i]);
                i++; // Skip the second character of the pair
            } else {
                // Character has no pair
                middle = String.valueOf(c[i - 1]);
            }
        }

        // If the last character wasn't processed, it is the middle
        if (c.length % 2 == 1 && middle.equals("")) {
            middle = String.valueOf(c[c.length - 1]);
        }

        StringBuilder right = new StringBuilder(left);
        right.reverse();

        return left.toString() + middle + right.toString();
    }
}