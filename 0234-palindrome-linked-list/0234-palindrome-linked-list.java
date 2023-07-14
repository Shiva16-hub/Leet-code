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
//     ListNode reverse(ListNode head){
//          ListNode current = head;
//         ListNode pre = null;
//         ListNode next = null;
//         while(current != null){
//             next = current.next;
//             current.next = pre;
//             pre = current;
//             current=next;
            
//         }
//         head = pre;
//         return head;
    //}
    public boolean isPalindrome(ListNode head) {
       // ListNode newlist = new ListNode();
       //  ListNode oldlist = new ListNode();
       //  oldlist=head;
       //  newlist = reverse(head);
       //  while(oldlist!=null){
       //      System.out.println(oldlist.val);
       //      oldlist=oldlist.next;
       //  }
       //  while(oldlist != null && newlist != null){
       //      // System.out.println(oldlist.val+" "+newlist.val);
       //      if(oldlist.val != newlist.val){
       //          return false;
       //      }
       //      oldlist = oldlist.next;
       //      newlist = newlist.next;
       //  }
       //  return true;
        
        Stack  <Integer> s = new Stack<>();
        ListNode current = head;
        while(current != null){
            s.push(current.val);
            current = current.next;
        }
        current = head;
        while(current != null){
            if(s.peek() != current.val){
                return false;
            }else{
              s.pop();
                current = current.next;
            }
        }
        return true;
    }
}