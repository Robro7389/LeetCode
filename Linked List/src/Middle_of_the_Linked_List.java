public class Middle_of_the_Linked_List {
    //Leetcode 876. Middle of the linked list

    public class ListNode{
        int val;
        ListNode next;
    }

    public ListNode middleNode(ListNode head) {
        return slowFast(head,head);
    }

    public ListNode slowFast(ListNode slow,ListNode fast){
        if(fast == null || fast.next == null){
            return slow;
        }
        return slowFast(slow.next,fast.next.next);
    }
}
