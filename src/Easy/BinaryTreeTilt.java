package Easy;

public class BinaryTreeTilt {
	int tilt = 0;

	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		sum(root);
		return tilt;
	}

	public int sum(TreeNode root) {
		if (root == null)
			return 0;
		int leftSubTreeSum = sum(root.left);
		int rightSubTreeSum = sum(root.right);
		tilt += Math.abs(leftSubTreeSum - rightSubTreeSum);
		return root.val + leftSubTreeSum + rightSubTreeSum;
	}
}
