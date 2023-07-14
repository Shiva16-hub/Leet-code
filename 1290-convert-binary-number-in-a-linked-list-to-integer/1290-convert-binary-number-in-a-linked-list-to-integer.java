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
    public int getDecimalValue(ListNode head) {
        ListNode current=head;
        String ans="";
        while(current!=null){
            ans+=Integer.toString(current.val);
            current=current.next;
        }
        int decimal=Integer.parseInt(ans,2);  
        return decimal;
    }
}