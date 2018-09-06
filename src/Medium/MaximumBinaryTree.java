package Medium;

public class MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public TreeNode helper(int[] nums, int low, int high) {
		if (low > high)
			return null;
		int maxIndex = low;
		for (int i = low; i <= high; i++) {
			if (nums[i] > nums[maxIndex])
				maxIndex = i;
		}
		TreeNode root = new TreeNode(nums[maxIndex]);
		root.left = helper(nums, low, maxIndex - 1);
		root.right = helper(nums, maxIndex + 1, high);
		return root;
	}
}
