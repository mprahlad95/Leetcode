package Easy;

public class BinarySearch {
	public int search(int[] nums, int target) {
		if (nums.length == 0 || nums == null)
			return -1;
		return helper(nums, target, 0, nums.length - 1);
	}

	public int helper(int[] arr, int n, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (n == arr[mid]) {
			return mid;
		}
		if (n < arr[mid]) {
			return helper(arr, n, low, mid - 1);
		}
		return helper(arr, n, mid + 1, high);
	}
}
