// Last updated: 2/13/2026, 9:48:49 AM
class Solution {
    public List<List<Integer>> permute(int[] arr) {
           List<List<Integer>> result=new ArrayList<>();
	     
	    List<Integer> x= new ArrayList<>();
        permutation(result,x,arr);// calling recursion function and passing parameters required to perform the function
        return result;
        }
      public static void permutation(List<List<Integer>>result, List<Integer>current, int[]arr){
            if (current.size()== arr.length)//the list should be printed only after reaching this condition
            result.add(new ArrayList<>(current));//creating new arraylist"current"and pushing the values present in current array into result
            else{
            for (int i=0;i<arr.length;i++){
                if(( current.contains(arr[i]))){
                    continue;
                }
                current.add(arr[i]);
                permutation(result, current,arr);
                current.remove(current.size()-1);
            }
            
        }
	}
}