package Medium;

public class FindMinimumInSortedArray {
	public int findMin(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int low = 0, high = nums.length - 1, mid = 0;
		while (low < high) {
			if (nums[low] < nums[high])
				return nums[low];
			mid = (low + high) / 2;
			if (nums[mid] > nums[high])
				low = mid + 1;
			else
				high = mid;
		}
		return nums[low];
	}
}
