package Medium;

import java.util.*;

public class PartitionToKEqualSubsetSum {
	public static boolean canPartitionKSubsets(int[] nums, int k) {
		if (nums == null || nums.length == 0 || nums.length < k)
			return false;
		int target = 0;
		for (int num : nums)
			target += num;
		if (target % k != 0)
			return false;
		Arrays.sort(nums);
		return helper(nums, new int[k], nums.length - 1, target / k, k);
	}

	public static boolean helper(int[] nums, int[] sum, int position, int target, int k) {
		if (position == -1) {
			return true;
		}
		for (int i = 0; i < k; i++) {
			if (sum[i] + nums[position] <= target) {
				sum[i] += nums[position];
				if (helper(nums, sum, position - 1, target, k))
					return true;
				sum[i] -= nums[position];
			}
		}
		return false;
	}

	public static void main(String[] args) {
		canPartitionKSubsets(new int[] { 4, 3, 2, 3, 5, 2, 1 }, 4);
	}
}
