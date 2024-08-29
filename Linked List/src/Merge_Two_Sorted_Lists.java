public class Merge_Two_Sorted_Lists {
    //Leetcode 21. Merge Two Sorted Lists

    public class ListNode{
        ListNode next;
        int val;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode();
        ListNode temp = start;
        ListNode first = list1;
        ListNode second = list2;

        while(first != null && second != null){
            if(first.val < second.val){
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }
            else{
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }

        while(first != null){
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }

        while(second != null){
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }

        return start.next;
    }
}
