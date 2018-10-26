package Easy;

import java.util.*;

public class _2Sum_BST {
	public boolean findTarget(TreeNode root, int k) {
		if (root == null)
			return false;
		HashSet<Integer> hs = new HashSet<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode current;
		while (!q.isEmpty()) {
			current = q.remove();
			if (hs.contains(k - current.val))
				return true;
			else
				hs.add(current.val);
			if (current.left != null)
				q.add(current.left);
			if (current.right != null)
				q.add(current.right);
		}
		return false;
	}
}
