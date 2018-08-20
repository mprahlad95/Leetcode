package Medium;

import java.util.*;

public class MaxRootEachLevelBinaryTree {
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int currentMax = 0;
			int level = q.size();
			while (level-- > 0) {
				root = q.remove();
				currentMax = Math.max(root.val, currentMax);
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
			list.add(currentMax);
		}
		return list;
	}
}
