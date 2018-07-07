package Easy;

import java.util.*;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<>();
		TreeNode original_root = root;
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		return original_root;
	}
}
