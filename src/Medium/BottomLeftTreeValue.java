package Medium;

import java.util.*;

class BottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			if (root.right != null)
				q.add(root.right);
			if (root.left != null)
				q.add(root.left);
		}
		return root.val;
	}
}
