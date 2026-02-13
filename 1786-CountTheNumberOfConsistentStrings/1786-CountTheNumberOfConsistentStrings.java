// Last updated: 2/13/2026, 9:47:11 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {// other than allowed charcater is found s reduce the count 
                    
                    count--; 
                    break;
                }
            }
            count++; 
        }

        return count;
    }
}
