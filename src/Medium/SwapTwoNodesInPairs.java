package Medium;

public class SwapTwoNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head;
		while (current != null && current.next != null) {
			swap(current, current.next);
			current = current.next.next;
		}
		return head;
	}

	public void swap(ListNode l1, ListNode l2) {
		int temp = l1.val;
		l1.val = l2.val;
		l2.val = temp;
	}
}
