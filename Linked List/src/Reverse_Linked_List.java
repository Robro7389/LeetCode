public class Reverse_Linked_List {
    //Leetcode 206. Reverse Linked List

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        return revList(null,head,head.next);
    }

    public ListNode revList(ListNode prev,ListNode head,ListNode second){
        if(head == null){
            return prev;
        }
        ListNode temp = null;
        head.next = prev;
        if(second != null){
            temp = second.next;
        }

        return revList(head,second,temp);
    }
}
