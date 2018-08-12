package Medium;

import java.util.*;

public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (candidates == null || candidates.length == 0)
			return list;
		helper(candidates, target, list, new ArrayList<>(), 0);
		return list;
	}

	public static void helper(int[] candidates, int remaining, List<List<Integer>> list, List<Integer> tempList,
			int start) {
		if (remaining < 0)
			return;
		if (remaining == 0)
			list.add(new ArrayList<Integer>(tempList));
		for (int i = start; i < candidates.length; i++) {
			if (i > start && candidates[i] == candidates[i - 1])
				continue;
			tempList.add(candidates[i]);
			helper(candidates, remaining - candidates[i], list, tempList, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
