package Medium;

import java.util.*;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
		else if (remaining == 0)
			list.add(new ArrayList<Integer>(tempList));
		for (int i = start; i < candidates.length; i++) {
			tempList.add(candidates[i]);
			helper(candidates, remaining - candidates[i], list, tempList, i);
			tempList.remove(tempList.size() - 1);
		}
	}
}
