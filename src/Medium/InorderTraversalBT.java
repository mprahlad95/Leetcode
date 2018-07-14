package Medium;

import java.util.*;

public class InorderTraversalBT {
	public List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> unsorted = new ArrayList<>();
		if (root == null)
			return unsorted;
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.isEmpty()) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.pop();
				unsorted.add(root.val);
				root = root.right;
			}
		}
		return unsorted;
	}
}
