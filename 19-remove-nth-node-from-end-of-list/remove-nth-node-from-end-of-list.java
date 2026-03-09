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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null) return null;


        ListNode temp = head;
        int count = 0;

        while(temp!=null){
            count+=1;
            temp = temp.next;
        }

        count = count - n;
        temp = head;

        if(count == 0){
            return head.next;
        }

        while(count != 1){
            temp = temp.next;
            count -= 1;
        }
        temp.next = temp.next.next;

        return head;

    }
}