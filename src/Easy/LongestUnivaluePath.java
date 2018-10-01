package Easy;

public class LongestUnivaluePath {
	int maxLength = 0;

	public int longestUnivaluePath(TreeNode root) {
		if (root == null)
			return 0;
		findLength(root, root.val);
		return maxLength;
	}

	public int findLength(TreeNode root, int val) {
		if (root == null)
			return 0;
		int left = findLength(root.left, root.val);
		int right = findLength(root.right, root.val);
		maxLength = Math.max(maxLength, left + right);
		if (val == root.val)
			return Math.max(left, right) + 1;
		return 0;
	}
}
