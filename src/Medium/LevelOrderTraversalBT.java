package Medium;

import java.util.*;

public class LevelOrderTraversalBT {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		if (root == null)
			return arr;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			List<Integer> current = new ArrayList<>();
			int currentLevel = q.size();
			while (currentLevel-- > 0) {
				root = q.remove();
				current.add(root.val);
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
			arr.add(current);
		}
		return arr;
	}
}
