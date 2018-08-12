package Medium;

import java.util.*;

public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> list = new ArrayList<>();
		if (n == 0 || k == 0)
			return list;
		helper(k, n, list, new ArrayList<Integer>(), 1);
		return list;
	}

	public void helper(int length, int target, List<List<Integer>> list, List<Integer> tempList, int start) {
		if (tempList.size() == length && target == 0) {
			list.add(new ArrayList<Integer>(tempList));
			return;
		}
		for (int i = start; i < 10; i++) {
			tempList.add(i);
			helper(length, target - i, list, tempList, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
