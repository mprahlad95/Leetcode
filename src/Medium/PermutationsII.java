package Medium;

import java.util.*;

public class PermutationsII {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return result;
		backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
		Set<List> set = new HashSet<>(result);
		result.clear();
		for (List temp : set) {
			result.add(temp);
		}
		return result;
	}

	public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] visited) {
		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					tempList.add(nums[i]);
					backtrack(result, tempList, nums, visited);
					tempList.remove(tempList.size() - 1);
					visited[i] = false;
				}
			}
		}
	}
}
