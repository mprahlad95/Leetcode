package Easy;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int i = minDepth(root.left);
		int j = minDepth(root.right);
		if (i == 0 || j == 0)
			return i + j + 1;
		return Math.min(1 + i, 1 + j);
	}
}
