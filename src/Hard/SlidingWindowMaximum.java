package Hard;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return new int[0];
		int[] lmax = new int[nums.length];
		int[] rmax = new int[nums.length];
		int[] arr = new int[nums.length - k + 1];
		int maxSoFar = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % k == 0) {
				maxSoFar = nums[i];
			} else {
				maxSoFar = Math.max(maxSoFar, nums[i]);
			}
			lmax[i] = maxSoFar;
		}
		maxSoFar = nums[nums.length - 1];
		for (int i = nums.length - 1; i >= 0; i--) {
			if ((i + 1) % k == 0) {
				maxSoFar = nums[i];
			} else {
				maxSoFar = Math.max(maxSoFar, nums[i]);
			}
			rmax[i] = maxSoFar;
		}
		for (int i = 0; i < nums.length - k + 1; i++) {
			arr[i] = Math.max(lmax[i + k - 1], rmax[i]);
		}
		return arr;
	}
}
