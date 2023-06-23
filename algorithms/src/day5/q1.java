package day5;

//876. Middle of the Linked List

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class q1 {
    public static void main(String[] agrs) {
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        middleNode(a);
    }

    public static ListNode middleNode(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode node = head;
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
        node = head;

        int middle = list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1;

        for (; middle < list.size(); ++middle) {
            node = node.next;
        }

        return node;
    }
}
