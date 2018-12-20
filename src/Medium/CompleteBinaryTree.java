package Medium;

import java.util.*;

public class CompleteBinaryTree {
	public boolean isCompleteTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		// set Flag to be true when a non-full node is seen
		boolean flag = false;
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.remove();
			// If root.left is not null and flag is true, return false
			if (root.left != null) {
				if (flag)
					return false;
				queue.add(root.left);
			} else
				flag = true;

			// If root.right is not null and flag is true, return false
			if (root.right != null) {
				if (flag)
					return false;
				queue.add(root.right);
			} else
				flag = true;
		}
		return true;
	}
}
