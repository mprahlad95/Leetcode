package Hard;

public class MaximumSumPathBinaryTree {
	private static int result = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNode root) {
		compute(root);
		return result;
	}

	private static int compute(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = Math.max(0, compute(root.left));
		int right = Math.max(0, compute(root.right));
		result = Math.max(left + right + root.val, result);
		return Math.max(left, right) + root.val;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(-5);
		root.right.right = new TreeNode(5);
		root.right.left = new TreeNode(24);
		System.out.println(maxPathSum(root));
	}
}
