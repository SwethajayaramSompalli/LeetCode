package easy.leetcode;

class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class ConvertBinaryNumberinaLinkedListtoInteger1290 {

}


//Definition for singly-linked list.
  
 
class LinkedListtoInteger1290Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(ListNode.next!=null){
            sb.append(ListNode.val);
            ListNode.next();
        }
        return Integer.parseInt(sb,2);
    }
}

//Testing by github desktop - sublime