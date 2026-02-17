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
        if(head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode(-1);
        TreeMap<Integer, Integer> mpp = new TreeMap<>();
        ListNode temp = head;

        while(temp != null) {
            mpp.put(temp.val, mpp.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        temp = dummyNode;
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if(entry.getValue() == 1) {
                ListNode newNode = new ListNode(entry.getKey());
                temp.next = newNode;
                temp = newNode;
            }
        }

        return dummyNode.next;
        
        
    }
}