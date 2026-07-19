class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int d1 = 0;
            int d2 = 0;

            if (i >= 0) {
                d1 = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                d2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = d1 + d2 + carry;

            ans.append(sum % 10);

            carry = sum / 10;
        }

        return ans.reverse().toString();
    }
}