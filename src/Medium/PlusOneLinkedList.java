package Medium;

public class PlusOneLinkedList {
	public ListNode plusOne(ListNode head) {
		head = reverse(head);
		ListNode current = head;
		current.val = current.val + 1;
		while (current.val > 9) {
			current.val = 0;
			if (current.next == null)
				current.next = new ListNode(0);
			current = current.next;
			current.val += 1;
		}
		return reverse(head);
	}

	public ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
