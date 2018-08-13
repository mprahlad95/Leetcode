package Medium;

public class SearchIn2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int rows = matrix.length, cols = matrix[0].length;
		int low = 0, high = rows * cols - 1, mid;
		for (int i = 0; i < rows * cols; i++) {
			mid = (low + high) / 2;
			System.out.print(mid + " ");
			if (matrix[mid / cols][mid % cols] == target) {
				return true;
			}
			if (matrix[mid / cols][mid % cols] > target) {
				high = mid - 1;
			} else if (matrix[mid / cols][mid % cols] < target) {
				low = mid + 1;
			}
		}
		return false;
	}
}
