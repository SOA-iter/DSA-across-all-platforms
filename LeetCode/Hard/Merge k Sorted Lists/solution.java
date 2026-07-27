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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> minheap=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode root:lists){
            if(root!=null){
                minheap.add(root);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(!minheap.isEmpty()){
            ListNode smallest=minheap.poll();
            current.next=smallest;
            current=current.next;
            if(smallest.next!=null){
                minheap.add(smallest.next);
            }
        }
        return dummy.next;
    }
}