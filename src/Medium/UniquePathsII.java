package Medium;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0)
			return 0;

		int m = obstacleGrid.length, n = obstacleGrid[0].length;

		// If start or end has an obstacle, return 0
		if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
			return 0;

		int[][] dp = new int[m][n];

		// 1 -> Reachable. 0 -> Unreachable. For calculating number of unique paths
		// If first row contains 1, the following elements can not be reached
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 1)
				break;
			else
				dp[0][i] = 1;
		}

		// If first column ontains 1, the following elements can not be reached
		for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0] == 1)
				break;
			else
				dp[i][0] = 1;
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
