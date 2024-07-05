package leetcode;

//2

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int one = l1 == null ? 0 : l1.val;
            int two = l2 == null ? 0 : l2.val;

            int sum = one + two + carry;
            int remain = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(remain);
            tail.next = newNode;
            tail = tail.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return temp.next;
    }
}
