package week3;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

public class SlinkedList {
    public static void main(String[] agrs) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode h = reverseList(head);
        while (h != null) {
            System.out.println(h.val);
            h = h.next;
        }

        ListNode sHead = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode s = recurReverstList(sHead, null);
        while (s != null) {
            System.out.println(s.val);
            s = s.next;
        }
    }

    //iteratively
    public static ListNode reverseList(ListNode head) {
        ListNode result = null;

        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = result;
            result = temp;
        }

        return result;
    }

    //recursively
    public static ListNode recurReverstList(ListNode head, ListNode result) {
        if (head == null) {
            return result;
        }

        ListNode next = head.next;
        head.next = result;
        result = head;
        head = next;

        return recurReverstList(head, result);
    }
}
