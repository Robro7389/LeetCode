public class Remove_Nth_Node_From_End_of_List {
    //Leetcode 19.Remove Nth Node From End of List

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n == 1)){
            return null;
        }

        int count = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        ListNode prev = null;
        ListNode pres = head;

        int k = count - n;

        if(k == 0){
            return head.next;
        }

        for(int i = 0;i < k;i++){
            prev = pres;
            pres = pres.next;
        }

        prev.next = pres.next;
        return head;
    }
}
