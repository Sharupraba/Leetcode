// Last updated: 2/13/2026, 9:48:38 AM
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
            List<List<Integer>> result=new ArrayList<>();
	    int j=0;//initializing from where the loop should start 
	    List<Integer> x= new ArrayList<>();
        subset (result,x,arr,j);// calling recursion function and passing parameters required to perform the function
        return result;
        }
      public static void subset(List<List<Integer>>result, List<Integer>current, int[]arr,int j){
            result.add(new ArrayList<>(current));//creating new arraylist"current"and pushing the values present in current array into result
            for (int i=j;i<arr.length;i++){
                current.add(arr[i]);
                subset(result, current,arr,i+1);
                current.remove(current.size()-1);
            }
            
        }
	}
