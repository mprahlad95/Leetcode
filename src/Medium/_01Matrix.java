package Medium;

import java.util.*;

public class _01Matrix {
	public int[][] updateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return new int[0][0];
		Queue<int[]> q = new LinkedList<>();
		int[][] dist = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					dist[i][j] = 0;
					q.add(new int[] { i, j });
				} else
					dist[i][j] = Integer.MAX_VALUE;
			}
		}

		int direction[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!q.isEmpty()) {
			int[] temp = q.remove();
			for (int i = 0; i < 4; i++) {
				int currentrow = temp[0], currentcol = temp[1];
				int newrow = currentrow + direction[i][0], newcol = currentcol + direction[i][1];
				if (newrow >= 0 && newcol >= 0 && newrow < matrix.length && newcol < matrix[0].length) {
					if (dist[newrow][newcol] > dist[currentrow][currentcol] + 1) {
						dist[newrow][newcol] = dist[currentrow][currentcol] + 1;
						q.add(new int[] { newrow, newcol });
					}
				}
			}
		}
		return dist;
	}
}
