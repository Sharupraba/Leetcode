// Last updated: 2/13/2026, 9:48:19 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int current_c=1,max_count=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1]) continue;
            if(nums[i]-1== nums[i-1]) current_c++;
            else{
                max_count=Math.max(current_c,max_count);
                current_c=1;
            }
        }
            return Math.max(current_c,max_count);

        }
        
    
}


