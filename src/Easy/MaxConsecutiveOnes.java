package Easy;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int ones = 0, maxOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ones++;
				maxOnes = Math.max(maxOnes, ones);
			} else
				ones = 0;
		}
		return maxOnes;
	}
}
