// Last updated: 2/13/2026, 9:48:39 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int r = matrix.length;
        int c = matrix[0].length;
        int start = 0, end = r* c - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mValue = matrix[mid / c][mid % c]; 

            if (mValue == target) {
                return true;
            } else if (mValue < target) {
                start= mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
    }
