// Last updated: 2/13/2026, 9:48:06 AM
class Solution {
    public int titleToNumber(String str) {
         int res= 0;//should not initialize as one because 26 will be multiplies with  1 and hen it becomes 27 (1*26)+1=27
	 for(char i: str.toCharArray()){//if we initialize with zero(0*26)+1=1=A
	     res=res*26+(i-'A'+1);
	 }
	 return res;
	}
}
    