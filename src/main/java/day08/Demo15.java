package day08;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import sun.security.timestamp.TSRequest;

public class Demo15 {

    static String a="a";

    public static void test(){
        String b="b";
        System.out.println(a+b);

    }


    public static void main(String[] args) {
        Demo15 demo15 = new Demo15();
        String[] strs={"abc","add","abrfd"};
        System.out.println(demo15.longestCommonPrefix(strs));

    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix=getPrefix(prefix,strs[i]);
            if (prefix.length()==0){
                return prefix;
            }
        }
        return prefix;
    }

    private String getPrefix(String pre, String str) {
        if (pre.length()==0||str.length()==0){
            return "";
        }
        int length = Math.min(pre.length(), str.length());
        int index=0;
        for (int i = 0; i < length; i++) {
            if (pre.charAt(i)!= str.charAt(i)){
                break;
            }
            index++;
        }

        return pre.substring(0,index);
    }
}
