package baolun;

public class Test01 {
    public static void main(String[] args) {
        String num="123.00";
        double a=11.0;
        int b=10;
        double c=b;
        System.out.println(String.valueOf(123.01));
        System.out.println(Integer.valueOf("123"));
        System.out.println(Double.valueOf(num));
        /*Test01 test01 = new Test01();
        System.out.println(test01.isHuiWen("abcba"));*/
    }
    //题1
    public boolean existNum(int[][] nums,int num){
        int len = nums.length-1;
        int len2 = nums[0].length - 1;
        for (int i=0;i<len;i++){
            for (int j=0;j<len2;j++){
                if (nums[i][j]>num) break;
                if (nums[i][j]==num) return true;
            }
        }
        return false;
    }
    //题2
    public boolean isHuiWen(String str){
        int l=0,r=str.length()-1;
        while (l<r){
            if (str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    //题3
    public static boolean method(int a) {
        if (a < 1)
            return false;
        int num = 1;
        while (num <= a) {
            if (num == a) {
                return true;
            }
            num = num << 1;
        }
        return false;
    }
    //sql题  alter TABLE manusript ADD FOREIGN KEY（aid） REFERENCES author（aid）
}
