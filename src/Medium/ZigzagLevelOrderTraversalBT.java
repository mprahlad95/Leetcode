package Medium;

import java.util.*;

public class ZigzagLevelOrderTraversalBT {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> zigzagOrder = new ArrayList<List<Integer>>();
		if (root == null)
			return zigzagOrder;
		int currentLevel = 0;
		Boolean reverse = false;
		Deque<TreeNode> q = new LinkedList<>();
		q.addFirst(root);
		while (!q.isEmpty()) {
			List<Integer> currentList = new ArrayList<>();
			currentLevel = q.size();
			while (currentLevel-- > 0) {
				if (reverse) {
					root = q.removeFirst();
					if (root.right != null)
						q.addLast(root.right);
					if (root.left != null)
						q.addLast(root.left);
				} else {
					root = q.removeLast();
					if (root.left != null)
						q.addFirst(root.left);
					if (root.right != null)
						q.addFirst(root.right);
				}
				currentList.add(root.val);
			}
			zigzagOrder.add(currentList);
			reverse = !reverse;
		}
		return zigzagOrder;
	}
}
