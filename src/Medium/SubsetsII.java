package Medium;

import java.util.*;

public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		backtrack(nums, new ArrayList<Integer>(), list, 0);
		return new ArrayList<>(new HashSet<>(list));
	}

	public void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> list, int start) {
		list.add(new ArrayList<Integer>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(nums, tempList, list, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
