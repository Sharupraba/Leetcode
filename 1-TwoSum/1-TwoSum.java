// Last updated: 2/13/2026, 10:11:54 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] temp=new int [2];//this array is used to print the output like[0,1]
        for (int i=0;i<nums.length;i++){//traversing the whole array 
            for(int j =i+1;j<nums.length;j++){// starting the a pointer just after the i pointer and i value is fixed for one iteration, its checked with all other j values
                if(nums[i]+nums[j]==target){// if we add the two number present in the particular index we should get the target value
                    temp[0]=i;//returning the index... not the value 
                    temp[1]=j;
                }
            }
            
        }
        return temp;
        
        
    }
}