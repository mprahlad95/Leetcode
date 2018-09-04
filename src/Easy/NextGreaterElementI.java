package Easy;

import java.util.*;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < nums.length; ++i)
			m.put(nums[i], i);
		for (int i = 0; i < findNums.length; ++i) {
			int minIndex = -1;
			int index = m.get(findNums[i]);
			while (++index < nums.length) {
				if (nums[index] > findNums[i]) {
					minIndex = index;
					break;
				}
			}
			if (minIndex == -1)
				findNums[i] = -1;
			else
				findNums[i] = nums[minIndex];
		}
		return findNums;
	}
}
