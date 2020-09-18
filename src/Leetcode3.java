import java.util.HashSet;
import java.util.Set;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

/**
 * 环形链表
 * */
public class Leetcode3 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashSet = new HashSet<>();
        while (head != null){
            if(hashSet.contains(head)){
                return true;
            }else{
                hashSet.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
