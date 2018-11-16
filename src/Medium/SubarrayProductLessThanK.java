package Medium;

public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int count = 0, product = 1;
		for (int left = 0, right = 0; right < nums.length; right++) {
			product *= nums[right];
			while (left <= right && product >= k) {
				product /= nums[left];
				left++;
			}
			count += right - left + 1;
		}
		return count;
	}
}
