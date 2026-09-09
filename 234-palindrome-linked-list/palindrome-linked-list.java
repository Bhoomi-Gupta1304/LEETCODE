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
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr=head;
        return is(head);
    }
    public boolean is(ListNode head){
        if(head == null){
            return true;
        }
        boolean ans = is(head.next) && head.val==curr.val;
        if(ans==false){
            return false;
        }
        curr = curr.next;
        return ans;
        }
}