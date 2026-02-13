// Last updated: 2/13/2026, 9:47:38 AM
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        
        String[] temp = new String[words.length];
        int resIndex = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count1 = 0, count2 = 0, count3 = 0;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                
                if (row1.indexOf(c) != -1) {
                    count1++;
                } else if (row2.indexOf(c) != -1) {
                    count2++;
                } else if (row3.indexOf(c) != -1) {
                    count3++;
                }
            }

            int len = word.length();
            if (count1 == len || count2 == len || count3 == len) {
                temp[resIndex] = word;
                resIndex++;
            }
        }

        // Prepare final result array
        String[] result = new String[resIndex];
        for (int i = 0; i < resIndex; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
