// Last updated: 2/13/2026, 10:11:43 AM
class Solution {
    private String countRes(String s){
        StringBuilder res = new StringBuilder();
        int i=0;
        while(i < s.length()){
            int count = 1;
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            res.append(count).append(s.charAt(i));
            i++;
        }
        return res.toString();
    }    
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String res = "1";
        for(int i=0; i<n-1; i++){
            res = countRes(res);
        }
        return res;
    }
}