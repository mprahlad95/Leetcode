package Medium;

public class RangeSumQueryMutable {
	int[] dp, nums;

	public RangeSumQueryMutable(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = dp[i - 1] + nums[i];
		}
		this.nums = nums;
	}

	public void update(int i, int val) {
		updatesum(i, val);
	}

	public void updatesum(int i, int val) {
		nums[i] = val;
		if (i == 0) {
			dp[i] = val;
		}
		if (i == 0 && i == nums.length - 1) {
			return;
		}
		do {
			if (i == 0)
				continue;
			dp[i] = dp[i - 1] + nums[i];
		} while (++i < nums.length);
	}

	public int sumRange(int i, int j) {
		if (i == 0)
			return dp[j];
		return dp[j] - dp[i - 1];
	}
}
