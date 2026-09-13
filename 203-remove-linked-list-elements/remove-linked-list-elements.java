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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(0,head);
        ListNode temp = prev;
        while(temp!=null){
            while(temp.next!=null && temp.next.val==val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return prev.next;
    }
}