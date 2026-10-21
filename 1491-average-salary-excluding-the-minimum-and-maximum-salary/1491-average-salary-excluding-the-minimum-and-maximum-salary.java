class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double a = 0.0;
        int b= 0;
        for(int i = 1 ; i < salary.length-1 ; i++){
        a += salary[i];
        b++;
        }
        return a/b;
    }
}