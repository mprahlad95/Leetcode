package Easy;

import java.util.*;

public class LargestPerimeterTriangle {
	public int largestPerimeter(int[] A1) {
		Integer[] A = new Integer[A1.length];
		for (int i = 0; i < A1.length; i++) {
			A[i] = Integer.valueOf(A1[i]);
		}

		Arrays.sort(A, Collections.reverseOrder());

		for (int i = 0; i < A.length - 2; i++) {
			if (A[i] < A[i + 1] + A[i + 2])
				return A[i] + A[i + 1] + A[i + 2];
		}
		return 0;
	}
}
