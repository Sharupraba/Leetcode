// Last updated: 2/13/2026, 9:47:56 AM

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;}
            if(n<=0|| n%2!=0){
              return false;}
    else{
    return isPowerOfTwo(n/2);}
        
        
}
    
    }
