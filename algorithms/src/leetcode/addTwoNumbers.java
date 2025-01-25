package leetcode;

//2
class ListNode_2 {
    int val;
    ListNode_2 next;
    ListNode_2() {}
    ListNode_2(int val) { this.val = val; }
    ListNode_2(int val, ListNode_2 next) { this.val = val; this.next = next; }
}

public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode_2 l1 = new ListNode_2(2, new ListNode_2(4, new ListNode_2(3, null)));
        ListNode_2 l2 = new ListNode_2(5, new ListNode_2(6, new ListNode_2(4, null)));
        addTwoNumbers(l1, l2);
    }

    public static ListNode_2 addTwoNumbers(ListNode_2 l1, ListNode_2 l2) {
        ListNode_2 temp = new ListNode_2(0);
        ListNode_2 tail = temp;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int one = l1 == null ? 0 : l1.val;
            int two = l2 == null ? 0 : l2.val;

            int sum = one + two + carry;
            int remain = sum % 10;
            carry = sum / 10;

            ListNode_2 newNode = new ListNode_2(remain);
            tail.next = newNode;
            tail = tail.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return temp.next;
    }
}
