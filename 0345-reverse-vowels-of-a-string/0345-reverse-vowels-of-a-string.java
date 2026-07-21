class Solution {

    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int j = 0;
        int i = sb.length() - 1;

        while (j < i) {

            while (j < i && !isVowel(sb.charAt(j))) {
                j++;
            }

            while (j < i && !isVowel(sb.charAt(i))) {
                i--;
            }

            if (j < i) {
                char temp = sb.charAt(j);

                sb.setCharAt(j, sb.charAt(i));
                sb.setCharAt(i, temp);

                j++;
                i--;
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        return c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u';
    }
}