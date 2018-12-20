package Easy;

public class LargestTImeForGivenDigits {
	public String largestTimeFromDigits(int[] A) {
		int max = 0, count = 0, digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0;

		// Permutation to find max
		for (int a = 0; a < A.length; a++) {
			for (int b = 0; b < A.length; b++) {
				for (int c = 0; c < A.length; c++) {
					for (int d = 0; d < A.length; d++) {
						if (a != b && a != c && a != d && b != c && b != d && c != d) {
							if ((10 * A[c] + A[d]) < 60) {
								int minutes = (10 * A[a] + A[b]) * 60 + (10 * A[c] + A[d]);
								if (minutes < 1440) {
									count++;
									if (max < minutes) {
										max = minutes;
										digit1 = A[a];
										digit2 = A[b];
										digit3 = A[c];
										digit4 = A[d];
									}
								}
							}
						}
					}
				}
			}
		}

		if (count == 0)
			return "";
		else
			return digit1 + "" + digit2 + ":" + digit3 + "" + digit4;
	}
}
