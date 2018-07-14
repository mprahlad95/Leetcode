package Medium;

public class CoinChange_Minimum {
	public static int coinChange(int[] coins, int amount) {
		if (amount <= 0 || coins == null)
			return 0;
		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < coins.length; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i < coins.length; i++) {
			for (int j = 1; j <= amount; j++) {
				if (j < coins[i]) {
					if (i > 0) {
						dp[i][j] = dp[i - 1][j];
					} else
						dp[i][j] = -1;
				} else if (j % coins[i] == 0) {
					dp[i][j] = j / coins[i];
				} else if (j > coins[i]) {
					int coinIndex = i, total = 0, rem = j;
					while (coinIndex >= 0) {
						if (rem >= coins[coinIndex]) {
							total = total + rem / coins[coinIndex];
							rem = rem % coins[coinIndex];
							if (rem == 0)
								break;
						}
						coinIndex--;
					}
					if (rem != 0) {
						dp[i][j] = -1;
					} else {
						dp[i][j] = total;
					}
				}
			}
		}
		return dp[coins.length - 1][amount];
	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		System.out.println(coinChange(coins, 11));
	}
}
