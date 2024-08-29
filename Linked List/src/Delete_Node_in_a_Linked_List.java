public class Delete_Node_in_a_Linked_List {
    //Leetcode 237. Delete Node in a Linked List

    public class ListNode{
        ListNode next;
        int val;
    }

    public void deleteNode(ListNode node) {
        if(node.next.next == null){
            node.val = node.next.val;
            node.next = null;
            return;
        }
        node.val = node.next.val;
        deleteNode(node.next);
    }
}
