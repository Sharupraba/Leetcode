// Last updated: 2/13/2026, 9:48:09 AM
class Solution {
    public String convertToTitle(int n) {
        	StringBuilder ans =new StringBuilder();
		
		while(n>0){
		    n--;//4
		    int r=n%26;//r=3 29%26
		    ans.append((char)(r+'A'));
		    n/=26;// 1/26=0
		}
		return ans.reverse().toString();
	}
}

        
    