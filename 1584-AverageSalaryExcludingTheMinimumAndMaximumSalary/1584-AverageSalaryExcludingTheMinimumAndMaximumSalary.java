// Last updated: 2/13/2026, 9:47:12 AM
class Solution {
    public double average(int[] salary) {
        
        for (int i = 0; i < salary.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[j] < salary[minIndex]) {
                    minIndex = j;
                }
            }
        
            int temp = salary[i];
            salary[i] = salary[minIndex];
            salary[minIndex] = temp;
        }

        
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum =sum+ salary[i];// summing the middle elements but not including the first and last
        }

        return (double) sum / (salary.length - 2);
    }
}
