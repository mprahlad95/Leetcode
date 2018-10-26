package Easy;

public class DiameterOfBinaryTree {
	int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;
		height(root);
		return max;
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;
		int left = height(root.left);
		int right = height(root.right);
		max = Math.max(max, left + right);
		return Math.max(left, right) + 1;
	}
}
