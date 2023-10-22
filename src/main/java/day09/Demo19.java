package day09;

public class Demo19 {
    public static void main(String[] args) {
        int[] num={1,3,4,6,8};
        int[] ints = Demo19.twoSum(num, 7);

    }

    public static int[] twoSum2(int[] numbers, int target){
        //双指针解法
        int l=0,r= numbers.length-1;
        while (l<r){
            if (target-numbers[l]>numbers[r]){
                l++;
            }
            if (target-numbers[l]<numbers[r]){
                r--;
            }
            if (target-numbers[l]==numbers[r]){
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{};
    }


    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length - 1;
        for (int l = 0; l < len; l++) {
            for (int r = len; r > l; r--) {
                if (target-numbers[l]>numbers[r]){
                    break;
                }
                if (target==numbers[l]+numbers[r]){
                    return new int[]{l+1,r+1};
                }
            }
        }
        return new int[]{};
    }
}
