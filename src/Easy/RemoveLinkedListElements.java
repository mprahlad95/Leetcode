package Easy;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0), current = dummy;
		dummy.next = head;
		while (head != null) {
			if (head.val != val) {
				current.next = head;
				current = current.next;
			}
			head = head.next;
		}
		current.next = null;
		return dummy.next;
	}
}
