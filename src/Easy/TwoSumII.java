package Easy;

import java.util.*;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null)
			return new int[0];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i]))
				return new int[] { map.get(target - numbers[i]), i + 1 };
			else
				map.put(numbers[i], i + 1);
		}
		return new int[0];
	}
}
