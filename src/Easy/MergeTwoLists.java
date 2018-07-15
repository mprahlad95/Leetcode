package Easy;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode start = null, current = null, prev = null;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				current.next = l2;
				break;
			}
			if (l2 == null) {
				current.next = l1;
				break;
			}
			if (l2.val > l1.val) {
				current = l1;
				l1 = l1.next;
			} else {
				current = l2;
				l2 = l2.next;
			}
			if (start == null)
				start = current;
			if (prev != null)
				prev.next = current;
			prev = current;
		}
		return start;
	}
}