package Medium;

import java.util.*;

public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		Stack<TreeNode> s = new Stack<>();
		TreeNode previous = null;
		while (root != null || !s.isEmpty()) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.pop();
				if (previous != null && previous.val >= root.val)
					return false;
				previous = root;
				root = root.right;
			}
		}
		return true;
	}
}
