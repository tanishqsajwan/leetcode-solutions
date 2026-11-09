class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        if (x < 0) return isneg(x);
        return ispositive(x);
    }

    int ispositive(int x) {
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(x % 10);
            x /= 10;
        }
        long result = Long.parseLong(sb.toString());
        if (result > Integer.MAX_VALUE) return 0;
        return (int) result;
    }

    int isneg(int x) {
        // Use long to avoid Math.abs(MIN_VALUE) overflow
        long y = -(long) x;
        StringBuilder sb = new StringBuilder();
        sb.append('-');
        while (y > 0) {
            sb.append(y % 10);
            y /= 10;
        }
        long result = Long.parseLong(sb.toString());
        if (result < Integer.MIN_VALUE) return 0;
        return (int) result;
    }
}   