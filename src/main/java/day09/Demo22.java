package day09;

public class Demo22 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,3,1,7,5};
        System.out.println(Demo22.minSubArrayLen(9, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum=0,fast=0,slow=0,min=0;
        while (fast<nums.length){
            sum+=nums[fast];
            if (sum==target){
                if (min==0){
                    min=slow;
                }else {
                    min=Math.min(min,slow);
                }
                sum=0;
                slow=0;
                fast++;
                continue;
            }
            fast++;
            slow++;
        }
        return min+1;
    }
}
