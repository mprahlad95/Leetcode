package Hard;

public class MaximumSumPathBinaryTree {
	static int ret = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNode root) {
		if (root == null)
			return 0;
		helper(root);
		return ret;
	}

	public static int helper(TreeNode root) {
		if (root == null)
			return 0;
		int left = helper(root.left);
		int right = helper(root.right);
		if (left < 0)
			ret = Math.max(ret, Math.max(root.val, root.val + right));
		else if (right < 0)
			ret = Math.max(ret, Math.max(root.val, root.val + left));
		else
			ret = Math.max(ret, left + root.val + right);
		return Math.max(root.val, Math.max(root.val + left, root.val + right));
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(-5);
		root.right.right = new TreeNode(5);
		root.right.left = new TreeNode(9);
		System.out.println(maxPathSum(root));
	}
}
