package Easy;

import java.util.*;

public class N_RepeatedElementinSize2NArray {
	public int repeatedNTimes(int[] A) {
		Set<Integer> set = new HashSet<>();

		// Return first duplicate number as every other number is unique
		for (int num : A) {
			if (!set.add(num))
				return num;
		}
		return 0;
	}
}
