package Medium;

public class BinaryTreeLongestConsecutivePath {
	int maxLength = 0;

	public int longestConsecutive(TreeNode root) {
		if (root == null)
			return 0;
		return helper(root, 0, null);
	}

	public int helper(TreeNode root, int length, TreeNode parent) {
		if (root == null)
			return 0;
		if (parent != null && root.val - parent.val != 1)
			length = 1;
		else
			length++;
		maxLength = Math.max(maxLength, length);
		helper(root.left, length, root);
		helper(root.right, length, root);
		return maxLength;
	}
}
