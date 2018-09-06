package Medium;

public class MaxIncreaseToKeepCitySkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] maxRow = new int[grid.length], maxCol = new int[grid[0].length];
		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				maxRow[i] = Math.max(maxRow[i], grid[i][j]);
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				maxCol[i] = Math.max(maxCol[i], grid[j][i]);
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				sum += Math.min(maxRow[i], maxCol[j]) - grid[i][j];
			}
		}
		return sum;
	}
}
