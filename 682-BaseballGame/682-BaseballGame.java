// Last updated: 2/13/2026, 9:47:30 AM
class Solution {
    public int calPoints(String[] ops) {
        int[] score = new int[ops.length];
        int idx = 0; 
        
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                score[idx] = score[idx - 1] + score[idx - 2];
                idx++;
            } 
            else if (ops[i].equals("D")) {
                score[idx] = score[idx - 1] * 2;
                idx++;
            } 
            else if (ops[i].equals("C")) {
                idx--; // remove last score
            } 
            else {
                score[idx] = Integer.parseInt(ops[i]);
                idx++;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < idx; i++) {
            sum += score[i];
        }
        return sum;
    }
}
