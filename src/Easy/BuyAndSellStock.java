package Easy;

public class BuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int min = prices[0], difference = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				difference = Math.max(difference, prices[i] - min);
			}
		}
		return difference;
	}
}
