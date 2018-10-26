package Medium;

import java.util.*;

public class LinkedListComponents {
	public int numComponents(ListNode head, int[] G) {
		int ans = 0;
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : G)
			set.add(num);
		while (head != null) {
			if (set.contains(head.val))
				list.add(head.val);
			else {
				if (list.size() != 0) {
					list.clear();
					ans++;
				}
			}
			head = head.next;
		}
		if (list.size() != 0)
			ans++;
		return ans;
	}
}
