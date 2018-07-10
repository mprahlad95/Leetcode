package Easy;

public class TrimBST_iterative {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		while (root.val < L || root.val > R) {
			if (root.val < L)
				root = root.right;
			if (root.val > R)
				root = root.left;
		}
		TreeNode current = root;
		while (current != null) {
			while (current.left != null && current.left.val < L) {
				current.left = current.left.right;
			}
			current = current.left;
		}
		current = root;
		while (current != null) {
			while (current.right != null && current.right.val > R) {
				current.right = current.right.left;
			}
			current = current.right;
		}
		return root;
	}
}
