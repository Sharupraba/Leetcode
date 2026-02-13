// Last updated: 2/13/2026, 9:47:09 AM
class Solution {
    public int findCenter(int[][] e) {
        return e[0][0]==e[1][0]|| e[0][0]==e[1][1]? e[0][0]:e[0][1];
    }
}