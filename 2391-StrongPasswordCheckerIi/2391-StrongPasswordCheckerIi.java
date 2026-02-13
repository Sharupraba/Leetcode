// Last updated: 2/13/2026, 9:46:59 AM
class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int u=0,l=0,d=0,s=0;
         if(p.length()<8) return false;
        for(int i=0;i<p.length();i++){
            char t=p.charAt(i);
           if((i>0)&& (t==p.charAt(i-1))) return false;
           if(t>='A'&& t<='Z')u++;
           else if (t>='a'&& t<='z') l++;
           else if(t>='0'&& t<='9')d++;
           else s++;
        }
        return(u>0 && l>0 && d>0 && s>0);
        
    }
}