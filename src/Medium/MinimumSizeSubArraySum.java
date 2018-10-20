package Medium;

public class MinimumSizeSubArraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int left = 0, right = 0, max = 0, currminlength = 0, minlength = Integer.MAX_VALUE;
		while (left <= right && right < nums.length) {
			max += nums[right];
			while (left <= right && max >= s) {
				currminlength = right - left + 1;
				minlength = Math.min(minlength, currminlength);
				max -= nums[left++];
			}
			right++;
		}
		if (minlength == Integer.MAX_VALUE)
			return 0;
		return minlength;
	}
}
