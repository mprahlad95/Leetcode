package Medium;

import java.util.*;

public class LongestIncreasingSubsequence_naive {
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int len = nums.length, max = 1;
		int[] dp = new int[len];
		Arrays.fill(dp, 1);
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
					max = Math.max(max, dp[i]);
				}
			}
		}
		return max;
	}
}
