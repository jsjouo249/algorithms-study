package day5;

// 19. Remove Nth Node From End of List
import java.util.ArrayList;

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}
public class q2 {
    public static void main(String[] agrs) {
        Node a = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
//        Node a = new Node(1);
//        Node a = new Node(1, new Node(2));
        int n = 2;
        removeNthFromEnd(a, n);
    }

    public static Node removeNthFromEnd(Node head, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        Node node = head;
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }

        int index = list.size() - n;

        if (index == 0) {
            return head.next;
        }

        node = head;

        for (int i = 0; i < index - 1; ++i) {
            node = node.next;
        }

        node.next = node.next.next;

        return head;
    }
}
