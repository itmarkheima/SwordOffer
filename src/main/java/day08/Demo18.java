package day08;

import java.util.Arrays;

public class Demo18 {
    public static void main(String[] args) {

    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum+=nums[i];
        }
        return sum;
    }
}
