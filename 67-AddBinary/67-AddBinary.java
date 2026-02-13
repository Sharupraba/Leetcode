// Last updated: 2/13/2026, 9:48:41 AM
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = 0;
            int bit2 = 0;

            if (i >= 0) {
                bit1 = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                bit2 = b.charAt(j) - '0';
                j--;
            }

            int sum = bit1 + bit2 + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
        }

        return result;
    }
}
