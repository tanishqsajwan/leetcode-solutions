class Solution {
    public int countSegments(String s) {
       if (s.trim().isEmpty()) {
    return 0;
}
        String[] count = s.trim().split("\\s+");

        return count.length;
    }
}