package day05;

public class Demo10 {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j= nums.length-1;
        while (i<j){
            int s = nums[i] + nums[j];
            if (s==target){
                return new int[]{nums[i],nums[j]};
            }
            if (s<target){
                i++;
            }
            if (s>target){
                j--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

        }
    }
}
