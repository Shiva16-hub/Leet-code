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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current1=list1.next;
        ListNode prev=list1;
        ListNode current2 = list2.next;
        int i = 0;
        while(i<(a-1)){
            current1 = current1.next;
            prev = prev.next;
            i++;
        }
        prev.next = list2;
        
        while(i<b){
            current1 = current1.next;
            i++;
        }
        
        while(current2.next!=null){
            current2 = current2.next;
        }
        current2.next = current1;
        return list1;
    }
    
}