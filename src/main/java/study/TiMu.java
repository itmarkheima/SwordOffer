package study;

import java.util.ArrayList;
import java.util.Stack;

public class TiMu {
    public static void main(String[] args) {
        TiMu tiMu = new TiMu();
        tiMu.timu2("((())");
        System.out.println(tiMu.timu1("2"));
    }

    //最长有效括号
    public int timu2 (String s) {
        // write code here
        int count=0;
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c =='('&& stack.peek()!='('){
                count++;
                stack.push(c);
            }
            if (c==')'&&stack.peek()=='('){
                count++;
            }else { count=0;}

        }
        return count;
    }

    //电话号码的字母组合
    public ArrayList<String> timu1(String str){
        ArrayList<String> list=new ArrayList<>();
        if (str.length()==0) return list;
        if (str.length()==1){
            Integer num = Integer.valueOf(str);
            String str2=getStr(num);
            for (int i = 0; i < str2.length(); i++) {
                String s = String.valueOf(str2.charAt(i));
                list.add(s);
            }
            return list;
        }

        return list;
    }

    private String getStr(Integer num) {

        switch (num){
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqr";
            case 8: return "tuv";
            case 9: return "wxyz";
        }

        return "";
    }
}
