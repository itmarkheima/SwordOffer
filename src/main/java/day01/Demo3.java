package day01;

import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Demo3 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int[] res=new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=stack.pop();
        }
        return res;
    }
}
