package Easy;

public class UnivaluedTree {
	public boolean isUnivalTree(TreeNode root) {
		return helper(root, root.val);
	}

	public boolean helper(TreeNode root, int val) {
		if (root == null)
			return true;
		if (root.val != val)
			return false;
		return helper(root.left, root.val) && helper(root.right, root.val);
	}
}
