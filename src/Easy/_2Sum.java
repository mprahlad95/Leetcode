package Easy;

import java.util.*;

class _2Sum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (map.containsKey(difference)) {
				int arr[] = { map.get(difference), i };
				return arr;
			}
			map.put(nums[i], i);
		}
		return null;
	}
}