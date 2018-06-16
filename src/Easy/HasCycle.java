package Easy;

public class HasCycle {
	public boolean hasCycle(ListNode head) {
		ListNode fast = null;
		ListNode slow = null;
		Boolean flag = false;
		while (fast != null && slow != null) {
			if (fast.next == null)
				return false;
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				flag = true;
			}
		}
		return flag;
	}
}
