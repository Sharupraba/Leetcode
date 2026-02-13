// Last updated: 2/13/2026, 10:11:50 AM
class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }

            // Check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }
        }

        String result = "";
        for (int i = start; i < start + maxLen; i++) {
            result += s.charAt(i);
        }

        return result;
    }
}
