package day08;

public class Demo16 {
    public static void main(String[] args) {
        System.out.println(Demo16.reverseWords("a good   example"));
        String[] s = "a good   example".split(" ");
        System.out.println(s.length);
        for (String s1 : s) {
            System.out.print(s1+",");
        }


    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        int len = arr.length-1;
        while (len>=0){
            if (arr[len].isEmpty()){
                len--;
                continue;
            }
            builder.append(arr[len]+" ");
            len--;
        }
        String result = builder.toString();
        return result.trim();
    }
}
