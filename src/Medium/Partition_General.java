package Medium;

import java.util.*;

public class Partition_General {
	public boolean canPartition(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		if (sum % 2 != 0)
			return false;
		Arrays.sort(nums);
		return dfs(nums, new int[2], nums.length - 1, sum / 2);
	}

	private boolean dfs(int[] nums, int[] sums, int index, int target) {
		if (index == -1) {
			return true;
		}
		for (int i = 0; i < 2; i++) {
			if (sums[i] + nums[index] > target) {
				continue;
			}
			sums[i] += nums[index];
			if (dfs(nums, sums, index - 1, target)) {
				return true;
			}
			sums[i] -= nums[index];
		}
		return false;
	}
}
