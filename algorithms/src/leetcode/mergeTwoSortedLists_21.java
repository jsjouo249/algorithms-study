package leetcode;

class ListNode_21 {
    int val;
    ListNode_21 next;
    ListNode_21() {}
    ListNode_21(int val) { this.val = val; }
    ListNode_21(int val, ListNode_21 next) { this.val = val; this.next = next; }
}

public class mergeTwoSortedLists_21 {
    public static void main(String[] agrs) {
        ListNode_21 list1 = new ListNode_21(1, new ListNode_21(2, new ListNode_21(4)));
        ListNode_21 list2 = new ListNode_21(1, new ListNode_21(3, new ListNode_21(4)));

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode_21 mergeTwoLists(ListNode_21 list1, ListNode_21 list2) {
        ListNode_21 answer = new ListNode_21();
        ListNode_21 temp = answer;

        while(list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }

        if (list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }

        return answer.next;
    }
}
