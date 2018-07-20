package Medium;

import java.util.*;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		List<Integer> temp = new ArrayList<Integer>();
		helper(root, temp, result, sum);
		return result;
	}

	public void helper(TreeNode root, List<Integer> temp, List<List<Integer>> result, int sum) {
		if (root == null)
			return;
		temp.add(root.val);
		if (root.left == null && root.right == null && root.val == sum)
			result.add(new ArrayList<Integer>(temp));
		helper(root.left, temp, result, sum - root.val);
		helper(root.right, temp, result, sum - root.val);
		temp.remove(temp.size() - 1); // remove leaf node to move to other paths
		return;
	}
}
