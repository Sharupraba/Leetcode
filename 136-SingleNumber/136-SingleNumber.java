// Last updated: 2/13/2026, 9:48:17 AM
class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i =0;i<nums.length;i++){
            c=c^nums[i];
        }
        return c;
    }
}