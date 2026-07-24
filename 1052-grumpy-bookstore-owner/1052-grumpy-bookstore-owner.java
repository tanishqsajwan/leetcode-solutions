class Solution {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        // Customers who are already satisfied
        int satisfied = 0;

        // Extra customers we can satisfy by using the technique
        int extra = 0;

        // Maximum extra customers possible
        int maxExtra = 0;

        // Traverse the entire day
        for (int i = 0; i < customers.length; i++) {

            // If owner is NOT grumpy,
            // these customers are always satisfied.
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }

            // If owner IS grumpy,
            // these customers can become satisfied
            // only if this minute lies inside our window.
            else {
                extra += customers[i];
            }

            // Once the window size becomes greater than 'minutes',
            // remove the leftmost element from the window.
            if (i >= minutes) {

                // Remove only if the leaving minute was grumpy.
                // Otherwise it was never counted in 'extra'.
                if (grumpy[i - minutes] == 1) {
                    extra -= customers[i - minutes];
                }
            }

            // Store the best window found so far.
            if (extra > maxExtra) {
                maxExtra = extra;
            }
        }

        // Already satisfied customers
        // +
        // Best extra customers obtained by the technique
        return satisfied + maxExtra;
    }
}