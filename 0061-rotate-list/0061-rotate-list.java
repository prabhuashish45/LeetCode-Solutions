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
   private ListNode findNthNode(ListNode node, int x) {
        ListNode temp = node;
        while(temp!= null && x > 1) {
            x--;
            temp = temp.next;
        }
        return temp;
    } 
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        k = k % count;
        if(k == 0) {
            return head;
        } 
        
       ListNode nthNode = findNthNode(head, count - k);
       ListNode kthNode = nthNode.next;
       nthNode.next = null;

       ListNode temp2 = kthNode;
       while(temp2.next != null) {
        temp2 = temp2.next;
       }
       temp2.next = head;
       head = kthNode;
       return head;
    }
}