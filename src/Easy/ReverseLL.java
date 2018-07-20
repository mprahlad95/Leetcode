package Easy;

public class ReverseLL {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head, prev = null, temp = null;
		while (current != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
