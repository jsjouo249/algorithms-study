package leetcode;

class ListNode_83 {
    int val;
    ListNode_83 next;
    ListNode_83() {}
    ListNode_83(int val) { this.val = val; }
    ListNode_83(int val, ListNode_83 next) { this.val = val; this.next = next; }
}

public class removeDuplcatesFromSortedList_83 {
    public static void main(String[] agrs) {
        System.out.println(deleteDuplicates(null));
    }

    public static ListNode_83 deleteDuplicates(ListNode_83 head) {
        ListNode_83 current = head;

        while(current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head == null ? new ListNode_83() : head;
    }
}
