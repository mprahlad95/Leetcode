package Easy;

import java.util.*;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0 || nums == null)
			return false;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}
}
