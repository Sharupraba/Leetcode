// Last updated: 2/13/2026, 9:48:44 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for(int i = s.length()-1 ; i >= 0 ; i-- ){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}