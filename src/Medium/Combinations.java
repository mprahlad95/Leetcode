package Medium;

import java.util.*;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<>();
		if (n <= 0 || k <= 0 || k > n)
			return list;
		helper(n, k, new ArrayList<Integer>(), list, 1);
		return list;
	}

	public void helper(int n, int length, List<Integer> tempList, List<List<Integer>> list, int start) {
		if (tempList.size() == length) {
			list.add(new ArrayList<Integer>(tempList));
			return;
		}
		for (int i = start; i <= n; i++) {
			tempList.add(i);
			helper(n, length, tempList, list, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
