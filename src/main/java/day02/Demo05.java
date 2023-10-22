package day02;


public class Demo05 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val) return head.next;
        ListNode prev=head;
        ListNode curr=head.next;
        while (curr!=null&&curr.val!=val){
            prev=curr;
            curr=curr.next;
        }
        if (curr!=null) prev.next=curr.next;
        return head;
    }
}
