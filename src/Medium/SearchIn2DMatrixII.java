package Medium;

public class SearchIn2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int rows = matrix.length, cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == target)
				return true;
		}
		for (int i = 0; i < rows; i++) {
			int low = 0, high = cols - 1, mid;
			while (low <= high) {
				mid = (low + high) / 2;
				if (target == matrix[i][mid])
					return true;
				if (target < matrix[i][mid])
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		return false;
	}
}
