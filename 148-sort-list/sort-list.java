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
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int[] arr = new int[count];
        curr = head;
        count = 0;
        while(curr!=null){
            arr[count++] = curr.val;
            curr = curr.next;
        }
        Arrays.sort(arr);
        count  = 0;
        curr = head;

        while(curr!=null){
            curr.val = arr[count++];
            curr = curr.next;
        }
        return head;
    }
}