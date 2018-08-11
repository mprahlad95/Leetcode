package Medium;

import java.util.*;

public class IncreasingSubsequences {
	public List<List<Integer>> findSubsequences(int[] nums) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		findSequence(res, new ArrayList<Integer>(), 0, nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>(res);
		return result;
	}

	public void findSequence(Set<List<Integer>> res, List<Integer> holder, int index, int[] nums) {
		if (holder.size() > 1) {
			res.add(new ArrayList<Integer>(holder));
		}
		for (int i = index; i < nums.length; i++) {
			if (holder.size() == 0 || holder.get(holder.size() - 1) <= nums[i]) {
				holder.add(nums[i]);
				findSequence(res, holder, i + 1, nums);
				holder.remove(holder.size() - 1);
			}
		}
	}
}
