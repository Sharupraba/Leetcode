// Last updated: 2/13/2026, 9:47:41 AM
class Solution {
    public int firstUniqChar(String s) {
        int[]temp=new int[26];
        for( int i=0;i<s.length();i++){
            temp[s.charAt(i)-'a'] ++;
        }
         for( int i=0;i<s.length();i++){
           if( temp[s.charAt(i)-'a']==1) return i;
        
    }
    return -1;
}
}