/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head.next;
        ListNode pre = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            if(pre.val != current.val){
                  pre = current;
                current=current.next;
              
            }else{
                pre.next = current.next;
                current= current.next;
            }
        }
        return head;
    }
}