package day09;

public class Demo23 {
    //二分查找
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Demo23.search(nums, 9));

    }

    public static int search(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target == nums[m]) {
                return m;
            }
            if (target > nums[m]) l = m + 1;
            if (target < nums[m]) r = m - 1;

        }
        return -1;

    }
}
