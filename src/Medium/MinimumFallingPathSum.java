package Medium;

public class MinimumFallingPathSum {
	public int minFallingPathSum(int[][] A) {
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				int currentmin = A[i - 1][j];
				if (j > 0 && A[i - 1][j - 1] < currentmin)
					currentmin = A[i - 1][j - 1];
				if (j < A.length - 1 && A[i - 1][j + 1] < currentmin)
					currentmin = A[i - 1][j + 1];
				A[i][j] += currentmin;
			}
		}
		for (int j = 0; j < A.length; j++) {
			min = Math.min(min, A[A.length - 1][j]);
		}
		return min;
	}
}
