package Medium;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
		Boolean obstacle = false;
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 1) {
				obstacle = true;
			}
			if (!obstacle)
				dp[0][i] = 1;
		}
		obstacle = false;
		for (int j = 0; j < m; j++) {
			if (obstacleGrid[j][0] == 1) {
				obstacle = true;
			}
			if (!obstacle)
				dp[j][0] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] != 1)
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}
}
