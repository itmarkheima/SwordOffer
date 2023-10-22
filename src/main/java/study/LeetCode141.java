package study;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LeetCode141 {

    //环形链表
    public boolean hasCycle(ListNode head) {

        if (head==null) return false;

        ListNode fast=head,slow=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
