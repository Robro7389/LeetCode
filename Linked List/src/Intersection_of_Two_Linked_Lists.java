public class Intersection_of_Two_Linked_Lists {
    //Leetcode 160. Intersection of two linked lists

    public class ListNode{
        int val;
        ListNode next;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = countList(headA);
        int count2 = countList(headB);
        if(count1 < count2){
            for(int i = 0;i < count2 - count1;i++){
                headB = headB.next;
            }
        }
        else{
            for(int i = 0;i < count1 - count2;i++){
                headA = headA.next;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int countList(ListNode head){
        if(head == null){
            return 1;
        }
        return countList(head.next) + 1;
    }
}
