package Medium;

import java.util.*;

public class CompleteBinaryTreeInserter {
	TreeNode eternalRoot;

	public CompleteBinaryTreeInserter(TreeNode root) {
		eternalRoot = root;
	}

	public int insert(int v) {
		TreeNode parent = insertHere(eternalRoot);
		if (parent.left == null)
			parent.left = new TreeNode(v);
		else
			parent.right = new TreeNode(v);
		return parent.val;
	}

	public TreeNode get_root() {
		return eternalRoot;
	}

	public TreeNode insertHere(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.remove();
			if (temp.left == null || temp.right == null)
				return temp;
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return null;
	}
}
