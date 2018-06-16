package Easy;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		ListNode next = null;
		while (p != null && p.next != null) {
			next = p.next;
			if (p.val == p.next.val) {
				p.next = p.next.next;
			} else
				p = p.next;
		}
		return head;
	}
}
