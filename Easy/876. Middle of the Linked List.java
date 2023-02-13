

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode middleNode(ListNode head) {
ListNode slow = head;
ListNode fast = head;

while(fast!=null && fast.next !=null){
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
    }
}



 public class Main {
     public static void main(String[] args) {
         Solution solution = new Solution();
         ListNode node1 = new ListNode(1);
         ListNode node2 = new ListNode(2);
         ListNode node3 = new ListNode(3);
         ListNode node4 = new ListNode(4);
         ListNode node5 = new ListNode(5);
         node1.next = node2;
         node2.next = node3;
         node3.next = node4;
         node4.next = node5;

         ListNode result = solution.middleNode(node1);
         System.out.println("The middle node is: " + result.val);
     }
 }