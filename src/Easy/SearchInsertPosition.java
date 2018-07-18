package Easy;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		if (nums.length == 0 || nums == null || target < nums[0])
			return 0;
		if (target > nums[nums.length - 1])
			return nums.length;
		return helper(nums, target, 0, nums.length - 2);
	}

	public static int helper(int[] arr, int n, int low, int high) {
		if (low > high)
			return arr.length - 1;
		int mid = (low + high) / 2;
		if (n == arr[mid]) {
			return mid;
		}
		if (n > arr[mid] && n < arr[mid + 1]) {
			return mid + 1;
		}
		if (n < arr[mid]) {
			return helper(arr, n, low, mid - 1);
		}
		return helper(arr, n, mid + 1, high);
	}
}
