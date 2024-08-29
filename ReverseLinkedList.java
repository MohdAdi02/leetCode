import java.util.LinkedList;

public class ReverseLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = prev;   // Reverse the link
            prev = current;        // Move prev up
            current = next;        // Move current up
        }
        head = prev;  // Update head to the new front of the list
        return head;
    }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }
}
