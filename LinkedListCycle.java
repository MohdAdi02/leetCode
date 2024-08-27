import java.util.HashSet;

public class LinkedListCycle {


    public boolean hasCycle(LinkedListCycle head) {
        HashSet<LinkedListCycle> visitedNode = new HashSet<LinkedListCycle>();
        LinkedListCycle current = head;



        while(current != null){
            visitedNode.add(current);
//            current = current.next;    for .next error
            if(visitedNode.contains(current)){
                return true;
            }
        }
        return false;
    }
}
