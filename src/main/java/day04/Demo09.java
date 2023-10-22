package day04;

public class Demo09 {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
    public int[] exchange(int[] nums) {
        int length = nums.length;
        int[] res=new int[length];
        int left=0,right=length-1;

        for (int num : nums) {
            if (num%2==1){
                res[left++]=num;
            }else {
                res[right--]=num;
            }
        }
        return res;
    }
}
