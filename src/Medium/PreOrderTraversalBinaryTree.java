package Medium;

import java.util.*;

public class PreOrderTraversalBinaryTree {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			root = s.pop();
			list.add(root.val);
			if (root.right != null)
				s.push(root.right);
			if (root.left != null)
				s.push(root.left);
		}
		return list;
	}
}
