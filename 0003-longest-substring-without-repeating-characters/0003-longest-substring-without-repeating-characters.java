class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;                 // Left pointer (start of window)
int ans = 0;                  // Stores the best answer

HashSet<Character> set = new HashSet<>();
// Stores the characters currently inside the window

for (int right = 0; right < s.length(); right++) {

    // We are trying to add s[right] into our window.

    // But before adding it...
    // Check if it already exists in the window.
    while (set.contains(s.charAt(right))) {

        // Duplicate found.
        // Window is now invalid.

        // Remove the leftmost character.
        set.remove(s.charAt(left));

        // Move left forward.
        // Keep doing this until the duplicate disappears.
        left++;
    }

    // Now the window is valid.
    // Safe to add the current character.
    set.add(s.charAt(right));

    // Window is now:
    // s[left .... right]

    // Calculate current window length.
    ans = Math.max(ans, right - left + 1);
}

return ans;
    }
}