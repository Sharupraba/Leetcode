// Last updated: 2/13/2026, 9:48:20 AM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}