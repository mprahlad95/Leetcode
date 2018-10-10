package Medium;

import java.util.*;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> lists = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return lists;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0)
				break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int left = i + 1, right = nums.length - 1, target = -nums[i];
			while (left < right) {
				if (nums[left] + nums[right] == target) {
					lists.add(new ArrayList<>(Arrays.asList(nums[left], nums[i], nums[right])));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1])
						left++;
					while (left < right && nums[right] == nums[right + 1])
						right--;
				} else if (nums[left] + nums[right] > target)
					right--;
				else
					left++;
			}
		}
		return lists;
	}
}
