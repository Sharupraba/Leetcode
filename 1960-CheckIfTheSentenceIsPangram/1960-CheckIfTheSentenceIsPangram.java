// Last updated: 2/13/2026, 9:47:07 AM



      public class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int n = ch - 'a';
            arr[n] = 1;
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        
        return true;
    }
}
