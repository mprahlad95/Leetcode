package Medium;

public class SwapNodesinPair {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		ListNode prev = dummy;
		prev.next = head;
		while (prev.next != null && prev.next.next != null) {
			// First points to next of previous node
			ListNode first = prev.next;
			// Second points to next of first node
			ListNode second = first.next;
			// Next of first points to next of second (Swap begins)
			first.next = second.next;
			// Next of second points to first (swapped)
			second.next = first;
			// Next of previous points to second to skip swapping all nodes
			prev.next = second;
			prev = first;
		}
		return dummy.next;
	}
}
