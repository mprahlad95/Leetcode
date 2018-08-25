package Easy;

import java.util.*;

public class FindAnagramMappings {
	public int[] anagramMappings(int[] A, int[] B) {
		if (A == null || B == null)
			return new int[0];
		int[] arr = new int[A.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < B.length; i++) {
			map.put(B[i], i);
		}
		for (int i = 0; i < B.length; i++) {
			arr[i] = map.get(A[i]);
		}
		return arr;
	}
}
