// Last updated: 2/13/2026, 9:47:21 AM
class Solution {
    public int[] sortArray(int[] a) {
      split(a);
      return a;
    }

	private  void split(int[] a) {
		int len=a.length;
		if (len <= 1) return;// its the base case the array is divided until single element 
		int mid=len/2;// upto middle element
		int[] leftarray=new int[mid];
		int[] rightarray=new int[len-mid];
		int j=0;// this j is initialized to traverse the right array 
		for(int i=0; i<len; i++) {
			if(i<mid) {
				leftarray[i]=a[i];
			}
			else {
				rightarray[j]=a[i];
				j++;
			}
		}
		split(leftarray);// recursively calling( diving the left array until single element)
		split(rightarray);// recursively calling rightarray
		merge(leftarray,rightarray,a);
	}
	public   void merge(int[] leftarray,int[] rightarray,int[] a) {
		int lesize=a.length/2;
		int risize=a.length-lesize;
		int i=0,le=0,ri=0; // i= index of original array;le , ri are left and right array 
		while(le<lesize&& ri<risize) {
			if(leftarray[le]<rightarray[ri]) {
				a[i]=leftarray[le];
				i++;
				le++;
			} else {
				a[i]=rightarray[ri];
				i++;
				ri++;
			}
		}
		while(le<lesize) {// THESE TWO while loops are used to print the 
			a[i]=leftarray[le];
			i++;
			le++;
		}
		while(ri<risize) {
			a[i]=rightarray[ri];
			i++;
			ri++;
		}
	}
}

	