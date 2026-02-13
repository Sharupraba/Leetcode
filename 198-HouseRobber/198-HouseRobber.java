// Last updated: 2/13/2026, 9:48:04 AM
class Solution {
    public int rob(int[] nums) {
        if (nums.length<2)
        return nums[0];
        int[]hr=new int[nums.length];
        hr[0]=nums[0];
        hr[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            hr[i]=Math.max(hr[i-2]+nums[i],hr[i-1]);

        }
        return hr[nums.length-1];
        
    }
}