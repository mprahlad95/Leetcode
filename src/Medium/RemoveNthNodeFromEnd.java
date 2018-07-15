package Medium;

public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || (head.next == null))
			return null;
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode slow = temp, fast = temp;
		int startMoving = 1;
		while (fast.next != null) {
			if (startMoving++ > n) {
				slow = slow.next;
			}
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return temp.next;
	}
}
