package Medium;

public class TargetSum_recursive {
	int count = 0;

	public int findTargetSumWays(int[] nums, int S) {
		if (nums == null || nums.length == 0)
			return 0;
		helper(nums, 0, 0, S);
		return count;
	}

	public void helper(int[] nums, int i, int currentsum, int S) {
		if (i == nums.length) {
			if (currentsum == S)
				count++;
		} else {
			helper(nums, i + 1, currentsum + nums[i], S);
			helper(nums, i + 1, currentsum - nums[i], S);
		}
	}
}
