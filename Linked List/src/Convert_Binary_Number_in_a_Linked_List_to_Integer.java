public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
    //LEETCODE 1290.Convert Binary Number in a Linked List to Integer

    public class ListNode(){
        ListNode next;
        int val;
    }
    public int getDecimalValue(ListNode head) {
        int num = 0;
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        count--;
        temp = head;
        while(temp != null){
            num += (int) (Math.pow(2,count--) * temp.val);
            temp = temp.next;
        }

        return num;
    }
}
