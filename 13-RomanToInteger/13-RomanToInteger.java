// Last updated: 2/13/2026, 10:11:48 AM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int ans=0;
        int y=0;
        for(int i=s.length()-1;i>=0;i--){
            int x = hs.get(s.charAt(i));
            if(x>=y)//the last element compared with before element if before element isb greater then add it with the present element
            ans +=x;
            else
            ans-=x;// if ithe before element is small it should be subtracted 
            y=x;
        }
        return ans;
        
    }
}