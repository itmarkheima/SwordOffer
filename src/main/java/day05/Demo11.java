package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo11 {
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        Demo11 demo11 = new Demo11();
        System.out.println(demo11.reverseWords("hello world! blue"));
    }
}
