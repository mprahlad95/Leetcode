package Medium;

import java.util.*;

public class FruitIntoBasket {
	public int totalFruit(int[] tree) {
		Map<Integer, Integer> map = new HashMap<>();
		int left = 0, right = 0, result = 0;
		for (int i = 0; i < tree.length; i++) {
			if (map.size() <= 2) {
				map.put(tree[i], right++);
			}
			if (map.size() > 2) {
				int leftIndex = Collections.min(map.values());
				map.remove(tree[leftIndex]);
				left = leftIndex + 1;
			}
			result = Math.max(result, right - left);
		}
		return result;
	}
}
