package day09;

public class Demo21 {
    public static void main(String[] args) {
        int[] nums={1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1};
        System.out.println(Demo21.findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int fast=0,slow=0;
        int max=0;
        while (fast<nums.length){
            if (nums[fast]!=1){
                fast++;
                slow=0;
                continue;
            }
            fast++;
            slow++;
            max=Math.max(max,slow);
        }

        return max;
    }
}
