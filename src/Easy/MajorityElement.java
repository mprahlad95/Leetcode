package Easy;

import java.util.*;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else
				map.put(nums[i], 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > nums.length / 2) {
				result = entry.getKey();
				break;
			}
		}
		return result;
	}
}
