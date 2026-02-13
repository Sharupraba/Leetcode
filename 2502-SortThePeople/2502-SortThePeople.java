// Last updated: 2/13/2026, 9:46:55 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n =names.length;
        for(int i =0;i<n-1;i++){
            for (int j =0;j<n-1-i;j++){
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    heights[j]= heights[j+1];
                    heights[j+1]= temp;
                    String temp1=names [j];
                    names [j]=names[j+1];
                    names[j+1] = temp1;
                }
            }
        }
        
        return names;
    }
}