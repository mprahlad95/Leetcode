package Medium;

import java.util.*;

public class MaximumSizeSubarraySumEqualsK {
	public int maxSubArrayLen(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0, diff = 0;

		// Starting point
		map.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			// Store ith current sum into hashmap
			map.putIfAbsent(sum, i);
			// Reverse lookup and compare with previously found diff
			if (map.containsKey(sum - k) && diff < i - map.get(sum - k)) {
				diff = i - map.get(sum - k);
			}
		}
		return diff;
	}
}
