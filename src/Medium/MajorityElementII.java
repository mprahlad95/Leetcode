package Medium;

import java.util.*;

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
		return helper(nums, 3);
	}

	public static List<Integer> helper(int[] nums, int k) {
		List<Integer> ret = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		if (nums.length == 0)
			return ret;
		for (int n : nums) {
			if (map.containsKey(n))
				map.put(n, map.get(n) + 1);
			else if (map.keySet().size() < k - 1)
				map.put(n, 1);
			else {
				boolean flag = false;
				for (Integer i : map.keySet()) {
					if (map.get(i) == 0) {
						map.remove(i);
						map.put(n, 1);
						flag = true;
						break;
					}
				}
				if (flag == false) {
					for (Integer i : map.keySet()) {
						map.put(i, map.get(i) - 1);
					}
				}
			}
		}
		for (Integer i : map.keySet()) {
			map.put(i, 0);
		}
		for (int n : nums) {
			if (map.containsKey(n))
				map.put(n, map.get(n) + 1);
		}
		for (Integer i : map.keySet()) {
			if (map.get(i) > nums.length / k)
				ret.add(i);
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 1, 1, 1, 2, 2, 2, 5 }));

	}
}
