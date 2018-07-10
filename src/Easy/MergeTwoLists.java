package Easy;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = null, current = null, prev = null;
        while (l1 !=  null || l2 != null) {
             if (l2 == null || l1 != null) {
            	 if (l2.val > l1.val) {
                current = l1;
                l1 = l1.next;
            } else {
                current = l2;
                l2 = l2.next;
            }
            if (start == null) start = current;
            if (prev != null) prev.next = current;
            prev = current;
        }
        }
        return start;
    }
}