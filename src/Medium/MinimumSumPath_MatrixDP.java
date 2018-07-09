package Medium;

public class MinimumSumPath_MatrixDP {
	public int minPathSum(int[][] grid) {
		if (grid == null)
			return 0;
		int rows = grid.length, cols = grid[0].length;
		int dp[][] = new int[rows + 1][cols + 1];
		for (int i = 1; i <= rows; i++) {
			dp[i][1] = dp[i - 1][1] + grid[i - 1][0];
		}
		for (int j = 1; j <= cols; j++) {
			dp[1][j] = dp[1][j - 1] + grid[0][j - 1];
		}
		for (int i = 2; i <= rows; i++) {
			for (int j = 2; j <= cols; j++) {
				dp[i][j] = grid[i - 1][j - 1] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[rows][cols];
	}
}
