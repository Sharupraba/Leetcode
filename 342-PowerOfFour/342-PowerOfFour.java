// Last updated: 2/13/2026, 9:47:43 AM

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;}
            if(n<=0|| n%4!=0){
              return false;}
    else{
    return isPowerOfFour(n/4);}
        
        
}
    
    }
