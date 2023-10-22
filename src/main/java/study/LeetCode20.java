package study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class LeetCode20 {
    //有效的括号
    public boolean isValid(String s) {
        if (s.length()%2==1) return false;
        Deque<Character> stack=new ArrayDeque();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                stack.addLast(s.charAt(i));
            }else if (stack.isEmpty() || !map.get(stack.removeLast()).equals(s.charAt(i))){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
