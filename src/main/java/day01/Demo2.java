package day01;
public class Demo2 {
//    字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
//    请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
    public String reverseLeftWords(String s, int n) {
        StringBuilder prefix = new StringBuilder();
        StringBuilder after=new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i>n-1){
                prefix.append(chars[i]);
            }else {
                after.append(chars[i]);
            }
        }
        prefix.append(after);

        return prefix.toString();
    }

    public String reverseLeftWords2(String s, int n){
        return s.substring(n)+s.substring(0,n);
    }

}
