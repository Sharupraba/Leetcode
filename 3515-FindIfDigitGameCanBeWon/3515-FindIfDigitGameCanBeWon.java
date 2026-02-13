// Last updated: 2/13/2026, 9:46:56 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 =0;//sum of sinle digit number
        int sum2=0;//sum of double digit number 
        for(int i=0; i<nums.length;i++){
            int n=nums[i];
            if (n<10){
            sum1= sum1+n;//already existing la iruka numb kooda add panitae irukanum ....after completion of each loop the n value changes
            }
            else{
                sum2= sum2+n;
            }

        }
        return sum1!=sum2;
        
    }
}