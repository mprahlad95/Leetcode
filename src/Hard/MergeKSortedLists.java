package Hard;

import java.util.*;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode node1, ListNode node2) {
				if (node1.val >= node2.val)
					return 1;
				else
					return -1;
			}
		});
		for (ListNode list : lists) {
			if (list != null)
				queue.add(list);
		}
		ListNode head = new ListNode(0), curr = head;
		while (queue.size() > 0) {
			ListNode temp = queue.remove();
			curr.next = temp;
			if (temp.next != null)
				queue.add(temp.next);
			curr = curr.next;
		}
		return head.next;
	}
}
