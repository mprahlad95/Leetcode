package Medium;

public class RotateImage {
	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;
		int rows = matrix.length, cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = i; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][rows - j - 1];
				matrix[i][rows - j - 1] = temp;
			}
		}
	}
}
