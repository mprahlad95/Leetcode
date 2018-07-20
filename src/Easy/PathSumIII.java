package Easy;

public class PathSumIII {
	public int pathSum(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	public int helper(TreeNode root, int sum) {
		int res = 0;
		if (root == null)
			return res;
		if (sum == root.val)
			res++;
		res += helper(root.left, sum - root.val);
		res += helper(root.right, sum - root.val);
		return res;
	}
}
