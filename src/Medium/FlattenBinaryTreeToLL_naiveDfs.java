package Medium;

import java.util.*;

public class FlattenBinaryTreeToLL_naiveDfs {
	public void flatten(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		TreeNode start = root;
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		ArrayList<TreeNode> nodes = new ArrayList<>();
		while (!s.isEmpty()) {
			root = s.pop();
			nodes.add(root);
			if (root.right != null)
				s.push(root.right);
			if (root.left != null)
				s.push(root.left);
		}
		link_helper(nodes, start);
	}

	public void link_helper(ArrayList<TreeNode> nodes, TreeNode root) {
		if (root == null)
			return;
		for (TreeNode node : nodes) {
			System.out.print(node.val + " ");
			root.right = node;
			root.left = null;
			root = root.right;
		}
	}
}
