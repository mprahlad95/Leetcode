package Medium;

import java.util.*;

public class FlattenBinaryTreeToLL_dfs {
	public void flatten(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			root = s.pop();
			if (root.right != null)
				s.push(root.right);
			if (root.left != null)
				s.push(root.left);
			if (!s.isEmpty()) {
				root.right = s.peek();
			}
			root.left = null;
		}
	}
}
