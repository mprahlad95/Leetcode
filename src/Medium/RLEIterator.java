package Medium;

import java.util.*;

public class RLEIterator {
	List<Integer> list = new ArrayList<>();
	int k = 0;

	public RLEIterator(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0 && A[i] == 0) {
				i += 2;
			}
			list.add(A[i]);
		}
	}

	public int next(int n) {
		while (n >= 0) {
			if (k >= list.size())
				return -1;
			if (list.get(k) >= n) {
				list.set(k, list.get(k) - n);
				return list.get(k + 1);
			} else if (list.get(k) < n) {
				n -= list.get(k);
				k += 2;
			}
		}
		return -1;
	}
}
