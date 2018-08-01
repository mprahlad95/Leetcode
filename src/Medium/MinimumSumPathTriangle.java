package Medium;

import java.util.*;

public class MinimumSumPathTriangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0)
			return 0;
		int level = triangle.size() - 1;
		int dp[][] = new int[level + 1][level + 1];
		for (int i = 0; i <= level; i++) {
			dp[level][i] = triangle.get(level).get(i);
		}
		level--;
		for (; level >= 0; level--) { // start from bottom
			for (int j = 0; j <= level; j++) {
				int val = triangle.get(level).get(j);
				dp[level][j] = val + Math.min(dp[level + 1][j], dp[level + 1][j + 1]);
			}
		}
		return dp[0][0];
	}
}
