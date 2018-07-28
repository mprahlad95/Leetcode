package Medium;

public class BinaryTreePruning {
	public TreeNode pruneTree(TreeNode root) {
		if (root == null)
			return null;
		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);
		if (root.left != null || root.val == 1 || root.right != null)
			return root;
		else
			return null;
	}
}
