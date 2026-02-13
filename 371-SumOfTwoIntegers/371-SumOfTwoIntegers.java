// Last updated: 2/13/2026, 9:47:42 AM
class Solution {
    public int getSum(int a, int b) {
        
        while(b!=0){
         int carry = a&b;// while doing & operation carry is returned 
         a = a^b;// while doing XOR sum is returned 
         b= carry << 1;// carry is shifted to left as ususal
        }
        return a;
    }
}