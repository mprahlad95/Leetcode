package Medium;

public class NumberOfCompleteNodes {
	public int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = height(root, true);
		int rightHeight = height(root, false);
		if (leftHeight == rightHeight) {
			return (1 << (leftHeight)) - 1;
		} else
			return 1 + countNodes(root.left) + countNodes(root.right);
	}

	public int height(TreeNode root, boolean leftTree) {
		if (root == null)
			return 0;
		int count = 0;
		if (leftTree) {
			while (root != null) {
				root = root.left;
				count++;
			}
		} else {
			while (root != null) {
				root = root.right;
				count++;
			}
		}
		return count;
	}
}
