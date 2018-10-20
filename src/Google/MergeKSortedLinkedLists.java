package Google;

import java.util.*;

public class MergeKSortedLinkedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1, ListNode l2) {
				return Integer.compare(l1.val, l2.val);
			}
		});
		for (ListNode list : lists) {
			if (list != null)
				pq.add(list);
		}
		ListNode head = new ListNode(0), current = head;
		while (pq.size() > 0) {
			ListNode temp = pq.remove();
			current.next = temp;
			if (temp.next != null)
				pq.add(temp.next);
			current = current.next;
		}
		return head.next;
	}
}
