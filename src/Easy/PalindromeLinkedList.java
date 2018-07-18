package Easy;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return true;
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverseList(slow);
		fast = head;
		while (slow != null) {
			if (slow.val != fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode prev = null, ahead = null;
		while (head != null) {
			ahead = head.next;
			head.next = prev;
			prev = head;
			head = ahead;
		}
		return prev;
	}
}
