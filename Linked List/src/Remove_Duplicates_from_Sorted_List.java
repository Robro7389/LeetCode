public class Remove_Duplicates_from_Sorted_List {
    //Leetcode 83. Remove duplicates from sorted list

    public class ListNode{
        ListNode next;
        int val;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null){
            while(second != null && second.val == first.val){
                second = second.next;
            }
            first.next = second;
            first = second;
        }
        return head;
    }
}
