package day10;

public class Demo25 {
    //爬楼梯问题
    public static void main(String[] args) {
        System.out.println(Demo25.climbStairs(4));
    }
    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int a = 1, b = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
        /*int[] nums=new int[n+1];
        nums[0]=0;
        nums[1]=1;
        nums[2]=2;
        for (int i = 3; i < nums.length; i++) {
            nums[i]=nums[i-1]+nums[i-2];
        }

        return nums[n];
    }*/

    }
