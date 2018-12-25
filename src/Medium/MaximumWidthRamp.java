package Medium;

public class MaximumWidthRamp {
	public int maxWidthRamp(int[] A) {
		int maxDist = A.length - 1;
		while (maxDist >= 0) {
			int j = A.length - 1;
			int i = j - maxDist;
			while (i >= 0) {
				if (A[i] <= A[j]) {
					return j - i;
				} else {
					i--;
					j--;
				}
			}
			maxDist--;
		}
		return 0;
	}
}
