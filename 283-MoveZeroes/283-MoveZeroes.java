// Last updated: 2/13/2026, 9:47:49 AM
class Solution {
    public void moveZeroes(int[] nums) {
     
for(int i=0;i<nums.length - 1;i++){
if(nums[i]==0){
    for (int j=i+1;j<nums.length;j++){
        if(nums[j]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            break;
        }
    }
}
}
    }
}
	