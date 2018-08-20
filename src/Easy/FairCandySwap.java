package Easy;

import java.util.*;

public class FairCandySwap {
	public int[] fairCandySwap(int[] A, int[] B) {
		if (A == null || B == null || A.length == 0 || B.length == 0)
			return new int[0];
		int sum1 = 0, sum2 = 0;
		Set<Integer> setA = new HashSet<>();
		for (int x : A) {
			sum1 += x;
			setA.add(x);
		}
		for (int x : B)
			sum2 += x;
		int difference = (sum1 - sum2) / 2;
		for (int x : B) {
			int remaining = x + difference;
			if (setA.contains(remaining)) {
				return new int[] { remaining, x };
			}
		}
		return new int[0];
	}
}
