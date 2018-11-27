package Medium;

import java.util.*;

public class _3SumSmaller {
	public int threeSumSmaller(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return 0;
		// Sort array
		Arrays.sort(nums);

		// Left, right and pivot. If triplet found, count += right - left.
		int smallerSum = 0;
		for (int pivot = 2; pivot < nums.length; pivot++) {
			int right = pivot - 1, left = 0;
			while (left < right) {
				if (nums[left] + nums[right] + nums[pivot] >= target)
					right--;
				else {
					smallerSum += right - left;
					left++;
				}
			}
		}
		return smallerSum;
	}
}
