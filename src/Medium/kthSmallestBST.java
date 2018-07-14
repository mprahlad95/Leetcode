package Medium;

import java.util.*;

public class kthSmallestBST {
	public int kthSmallest(TreeNode root, int k) {
		if (root == null)
			return 0;
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.isEmpty()) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.pop();
				if (k-- == 1)
					break;
				root = root.right;

			}
		}
		return root.val;
	}
}
