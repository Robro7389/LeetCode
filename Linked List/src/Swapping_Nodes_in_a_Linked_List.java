public class Swapping_Nodes_in_a_Linked_List {
    //Leetcode 1721.Swapping Nodes in a Linked List

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (k > count / 2) {
            k = (count % k) + 1;
        }
        ListNode first = null;
        ListNode second = null;
        int countTemp = count;
        temp = head;
        while (first == null) {
            if (countTemp == count - k + 1) {
                first = temp;
                break;
            }
            countTemp--;
            temp = temp.next;
        }

        while (second == null) {
            if (countTemp == k) {
                second = temp;
                break;
            }
            countTemp--;
            temp = temp.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}
