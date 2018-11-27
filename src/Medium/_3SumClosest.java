package Medium;

import java.util.*;

public class _3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return 0;
		// Sort array to use 3 pointers
		Arrays.sort(nums);

		// Maintain a variable to keep track of closest difference. When updated, update
		// closestSum to the sum.
		int closest = Integer.MAX_VALUE, closestSum = 0;
		for (int i = 2; i < nums.length; i++) {
			int left = 0, right = i - 1;
			while (left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				int diff = Math.abs(target - sum);
				if (diff < closest) {
					closest = diff;
					closestSum = sum;
				}
				if (sum > target)
					right--;
				else
					left++;
			}
		}
		return closestSum;
	}
}
