package Easy;

public class SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
			return false;
		if (helper(s, t))
			return true;
		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

	public boolean helper(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return helper(root1.left, root2.left) && helper(root1.right, root2.right);
	}
}
