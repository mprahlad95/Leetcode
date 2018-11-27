package Medium;

public class SumRoottoLeafNumbers {
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		return helper(root, 0);
	}

	public int helper(TreeNode root, int sum) {
		if (root == null)
			return 0;

		// Multiply current sum value with 10 and add root.val
		sum = sum * 10 + root.val;
		// Return sum if it's a leaf node
		if (root.left == null && root.right == null)
			return sum;
		return helper(root.left, sum) + helper(root.right, sum);
	}
}
