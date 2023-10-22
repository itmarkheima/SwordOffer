package day09;

public class Demo20 {
    public static void main(String[] args) {
        int[] nums={1,5,5,6,5,7,9};
        System.out.println(Demo20.removeElement(nums, 5));
    }
    public static int removeElement(int[] nums, int val) {
        int fast=0,slow=0;
        while (fast<nums.length){
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
