package Google;

import java.util.*;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Set<Integer> num_set = new HashSet<>();
		for (int num : nums)
			num_set.add(num);
		int maxlength = 1;
		for (int i = 0; i < nums.length; i++) {
			int current_num = nums[i], currentlongest = 1;
			while (num_set.contains(--current_num)) {
				currentlongest++;
				num_set.remove(current_num);
			}
			current_num = nums[i];
			while (num_set.contains(++current_num)) {
				currentlongest++;
				num_set.remove(current_num);
			}
			maxlength = Math.max(maxlength, currentlongest);
		}
		return maxlength;
	}
}
