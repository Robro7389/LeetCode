public class Palindrome_Linked_list {
    //Leetcode 234.Palindrome Linked List

    public class ListNode{
        ListNode next;
        int val;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode midHead = midHead(head);
        ListNode secHead = revLL(midHead);

        while(secHead != null && head != null){
            if(secHead.val != head.val){
                return false;
            }
            head = head.next;
            secHead = secHead.next;
        }

        return true;
    }

    public ListNode midHead(ListNode node){
        ListNode f = node;
        ListNode s = node;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode revLL(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        ListNode prev = node;
        ListNode pres = node.next;
        ListNode ahead = null;
        if(prev.next != null){
            ahead = pres.next;
        }
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = ahead;
            if(ahead != null){
                ahead = ahead.next;
            }
        }
        node.next = null;
        return prev;
    }
}
