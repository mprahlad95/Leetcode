package Easy;

public class MonotonicArray {
	public boolean isMonotonic(int[] A) {
		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i - 1]) {
				while (i < A.length) {
					if (A[i] < A[i - 1]) {
						return false;
					}
					i++;
				}
				return true;
			} else if (A[i] < A[i - 1]) {
				while (i < A.length) {
					if (A[i] > A[i - 1]) {
						return false;
					}
					i++;
				}
			}
		}
		return true;
	}
}
