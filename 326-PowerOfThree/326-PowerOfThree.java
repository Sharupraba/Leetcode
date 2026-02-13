// Last updated: 2/13/2026, 9:47:46 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;}
            if(n<=0|| n%3!=0){
              return false;}
    else{
    return isPowerOfThree(n/3);}
        
        
}
    
    }
