package Medium;

import java.util.*;

public class ThreeSum_naive {
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < num.length; i++) {
			int target = num[i];
			for (int j = i + 1; j < num.length; j++) {
				if (j == i)
					continue;
				for (int k = j + 1; k < num.length; k++) {
					if (k == i)
						continue;
					if (num[j] + num[k] + target == 0) {
						boolean flag = false;
						List<Integer> current_list = new ArrayList<>(Arrays.asList(target, num[j], num[k]));
						Collections.sort(current_list);
						for (int a = 0; a < list.size(); a++) {
							if (list.get(a).equals(current_list))
								flag = true;
						}
						if (!flag)
							list.add(new ArrayList<Integer>(current_list));
					}
				}
			}
		}
		return list;
	}
}
