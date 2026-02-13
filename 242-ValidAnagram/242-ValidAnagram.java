// Last updated: 2/13/2026, 9:47:52 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[]arr=new int[26];
        char[] s1=s.toCharArray();
          char[] s2=t.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(s2);
         boolean r=Arrays.equals(s1,s2);
         
            if(r){
                return true;
            }
          
          else{
            return false;

          
         }
    }
    
}