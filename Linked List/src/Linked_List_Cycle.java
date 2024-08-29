public class Linked_List_Cycle {
    //Leetcode 141. Linked list cycle

    public class ListNode{
        ListNode next;
        int val;
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f){
                return true;
            }
        }
        return false;
    }
}
