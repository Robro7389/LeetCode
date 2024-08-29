public class Remove_Linked_List_Elements {
    //Leetcode 203.Remove Linked List Elements

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        if(head == null){
            return null;
        }

        ListNode first = dummy;
        ListNode second = head;
        while(second != null){
            if(second.val == val){
                first.next = null;
                second = second.next;
            }
            else{
                first.next = second;
                first = second;
                second = second.next;
            }
        }

        return dummy.next;
    }
}
