package day03;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
//剑指 Offer 22. 链表中倒数第k个节点
public class Demo06 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former=head,latter=head;
        for (int i = 0; i < k; i++) {
            former=former.next;
        }
        while (former!=null){
            former=former.next;
            latter=latter.next;
        }
        return latter;
    }
}
