package Medium;

public class PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		int target = 0;
		for (int num : nums)
			target += num;
		if ((target & 1) == 1)
			return false;
		target /= 2;
		boolean[][] dp = new boolean[nums.length + 1][target + 1];
		for (int i = 1; i <= nums.length; i++) {
			for (int j = 1; j <= target; j++) {
				if (j < nums[i - 1])
					dp[i][j] = dp[i - 1][j];
				if (j == nums[i - 1])
					dp[i][j] = true;
				if (j > nums[i - 1]) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
				}
			}
		}
		return dp[nums.length][target];
	}
}
