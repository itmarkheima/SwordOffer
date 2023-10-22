package day07;

public class Demo15 {
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        int total=n*(n-1)/2;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+i;
        }
        return total-sum;
    }

}
