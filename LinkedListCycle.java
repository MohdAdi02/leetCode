import java.util.HashSet;

public class LinkedListCycle {
    static class ListNode{

    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNode = new HashSet<ListNode>();
        ListNode current = head;



        while(current != null){
            visitedNode.add(current);
            current = current.next;

            if(visitedNode.contains(current)){
                return true;
            }
        }
        return false;
    }
}
