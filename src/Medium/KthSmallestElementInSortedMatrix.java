package Medium;

import java.util.*;

public class KthSmallestElementInSortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		if (matrix == null || matrix.length == 0)
			return 0;
		int rows = matrix.length, cols = matrix[0].length;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < rows * cols; i++) {
			queue.add(matrix[i / cols][i % cols]);
		}
		while (k-- > 1) {
			queue.remove();
		}
		return queue.remove();
	}
}
