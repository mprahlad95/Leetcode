package Medium;

public class SwapNodesLL {
	public ListNode reverseInPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode next = head.next;
		head.next = reverseInPairs(head.next.next);
		next.next = head;
		return next;
	}
}
