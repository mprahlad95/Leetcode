package Medium;

import java.util.*;

public class _4Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		if (nums == null || nums.length < 4)
			return list;
		Arrays.sort(nums);

		int len = nums.length;
		for (int i = 0; i < len - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < len - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int left = j + 1, right = len - 1;
				while (left < right) {
					int sum = nums[left] + nums[right] + nums[i] + nums[j];
					if (sum == target) {
						list.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
						left++;
						right--;
						while (left < right && nums[left] == nums[left - 1])
							left++;
						while (left < right && nums[right] == nums[right + 1])
							right--;
					} else if (sum > target)
						right--;
					else
						left++;
				}
			}
		}
		return list;
	}
}
