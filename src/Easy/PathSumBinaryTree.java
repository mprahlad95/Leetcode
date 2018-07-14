package Easy;

import java.util.*;

public class PathSumBinaryTree {
	List<Integer> arr = new ArrayList<>();

	public boolean hasPathSum(TreeNode root, int sum) {
		return findSum(root, sum, arr);
	}

	public boolean findSum(TreeNode root, int sum, List<Integer> arr) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null) {
			if (root.val == sum) {
				arr.add(sum);
				return true;
			}
			return false;
		}
		if (findSum(root.left, sum - root.val, arr)) {
			arr.add(sum);
			return true;
		}
		if (findSum(root.right, sum - root.val, arr)) {
			arr.add(sum);
			return true;
		}
		return false;
	}
}
