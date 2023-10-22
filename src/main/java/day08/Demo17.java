package day08;

public class Demo17 {
    public static void main(String[] args) {
        char[] chars={'a','b','e','c','d'};

        //字符数组反转

        Demo17.reverseString(chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    public static void reverseString(char[] s) {
        int r = s.length - 1;
        int l = 0;
        while (l<r){
            char temp=s[r];
            s[r]=s[l];
            s[l]=temp;
            l++;
            r--;
        }
    }
}
