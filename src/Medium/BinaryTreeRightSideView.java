package Medium;

import java.util.*;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int level = q.size();
			while (level-- > 0) {
				root = q.remove();
				if (level == 0) {
					list.add(root.val);
				}
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
		}
		return list;
	}
}
