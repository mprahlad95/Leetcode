package Medium;

import java.util.*;

public class KthLargestElementInArray {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
