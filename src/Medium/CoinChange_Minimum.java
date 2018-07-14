package Medium;

import java.util.Arrays;

public class CoinChange_Minimum {
	public static int coinChange(int[] coins, int amount) {
		if (amount <= 0 || coins == null)
			return 0;
		int[][] dp = new int[coins.length + 1][amount + 1];
		Arrays.sort(coins);
		for (int j = 0; j <= amount; j++)
			dp[0][j] = Integer.MAX_VALUE;
		for (int i = 0; i <= coins.length; i++)
			dp[i][0] = 0;
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= amount; j++) {
				if (j >= coins[i - 1] && dp[i][j - coins[i - 1]] != Integer.MAX_VALUE)
					dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}

		if (dp[coins.length][amount] == Integer.MAX_VALUE)
			return -1;
		return dp[coins.length][amount];
	}

	public static void main(String[] args) {
		int[] coins = { 186, 419, 83, 408 };
		System.out.println(coinChange(coins, 6249));
	}
}
