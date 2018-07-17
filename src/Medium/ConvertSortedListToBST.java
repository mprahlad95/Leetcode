package Medium;

import java.util.*;

public class ConvertSortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		ArrayList<Integer> list = new ArrayList<>();
		ListNode current = head;
		while (current != null) {
			list.add(current.val);
			current = current.next;
		}
		return helper(list, 0, list.size() - 1);
	}

	public TreeNode helper(ArrayList<Integer> list, int low, int high) {
		if (low > high)
			return null;
		int mid = (low + high) / 2;
		TreeNode root = new TreeNode(list.get(mid));
		root.left = helper(list, low, mid - 1);
		root.right = helper(list, mid + 1, high);
		return root;
	}
}
