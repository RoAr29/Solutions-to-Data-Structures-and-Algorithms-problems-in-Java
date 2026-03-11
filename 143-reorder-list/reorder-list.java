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
    public void reorderList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }

        int i = 0;
        int j = al.size()-1;

        while(i<j){
            al2.add(al.get(i));
            al2.add(al.get(j));
            i++;
            j--;
        }     
        if(i==j){
            al2.add(al.get(i));
        }  

        temp = head;
        int k = 0;

        while(temp != null){
            temp.val = al2.get(k++);
            temp = temp.next;
        } 
    }
}