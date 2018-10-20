package Google;

public class MaxConescutiveOnesII {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int lastZero = 0, maxOnes = 0, zeroCount = 0, ones = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCount++;
				if (zeroCount == 1)
					lastZero = i;
			}
			if (zeroCount == 2) {
				maxOnes = Math.max(maxOnes, ones);
				ones = 0;
				i = lastZero;
				zeroCount = 0;
			} else
				ones++;
		}
		maxOnes = Math.max(maxOnes, ones);
		return maxOnes;
	}
}
