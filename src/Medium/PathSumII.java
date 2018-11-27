package Medium;

import java.util.*;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		helper(list, new ArrayList<>(), root, sum);
		return list;
	}

	public void helper(List<List<Integer>> list, List<Integer> current, TreeNode root, int sum) {
		if (root == null)
			return;
		// Add to current list, and main list if sum is found
		current.add(root.val);

		// Check for leaf node and if sum is found
		if (root.left == null && root.right == null && sum == root.val)
			list.add(new ArrayList<Integer>(current));

		// Call left and right and subtract sum
		helper(list, current, root.left, sum - root.val);
		helper(list, current, root.right, sum - root.val);

		// Backtrack if not found in the entire path
		current.remove(current.size() - 1);
	}
}
