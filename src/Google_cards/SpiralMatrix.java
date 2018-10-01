package Google_cards;

import java.util.*;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return list;
		int col = matrix.length, row = matrix[0].length;
		int top = 0, left = 0, bottom = col - 1, right = row - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			if (left > right || top > bottom)
				break;
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			if (left > right || top > bottom)
				break;
			for (int i = right; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			bottom--;
			if (left > right || top > bottom)
				break;
			for (int i = bottom; i >= top; i--) {
				list.add(matrix[i][left]);
			}
			left++;
			if (left > right || top > bottom)
				break;
		}
		return list;
	}
}
