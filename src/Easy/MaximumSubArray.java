package Easy;

public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
		int currMax = nums[0], max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currMax = Math.max(currMax + nums[i], nums[i]); // Kadane's algo. Current max is max of current index vs
			// current max + current index.
			max = Math.max(max, currMax); // compare current maximum with global maximum.
		}
		return max;
	}
}
