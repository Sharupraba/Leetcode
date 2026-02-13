// Last updated: 2/13/2026, 9:46:57 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        
        int elesum= 0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
              elesum = elesum+nums[i];
              int n = nums[i];
              while(n!=0){
                digsum= digsum+(n%10);//digsum+=(n%10)
                n=n/10;//n/=10
              }
        }
        return Math.abs (elesum-digsum);
    }
}