package Easy;

public class SymmetricBT {
	public boolean isSymmetric(TreeNode root) {
		return (root == null) || helper(root.left, root.right);
	}

	public boolean helper(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return (p == q);
		return (p.val == q.val) && helper(p.left, q.right) && helper(p.right, q.left);
	}
}
