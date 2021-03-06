package Easy;

import java.util.*;

public class FindAllNumbersDisappearedInArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		for (int i = 0; i < nums.length; i++) {
			if (nums[Math.abs(nums[i]) - 1] > 0)
				nums[Math.abs(nums[i]) - 1] *= -1;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0)
				list.add(i + 1);
		}
		return list;
	}
}
