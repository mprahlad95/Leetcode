package Easy;

public class MaximumProductofThreeNumbers {
	public int maximumProduct(int[] nums) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

		// Maximum product is Max(min1 * min2 * max1, max1 * max2 * max3)
		for (int num : nums) {
			// Find highest 3 values
			if (num > max1) {
				int temp1 = max1;
				max1 = num;
				int temp2 = max2;
				max2 = temp1;
				max3 = temp2;
			} else if (num > max2) {
				int temp2 = max2;
				max2 = num;
				max3 = temp2;
			} else if (num > max3)
				max3 = num;

			// Find 2 lowest values
			if (num < min1) {
				int temp1 = min1;
				min1 = num;
				min2 = temp1;
			} else if (num < min2)
				min2 = num;
		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
	}
}
