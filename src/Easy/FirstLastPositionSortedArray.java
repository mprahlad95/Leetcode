package Easy;

public class FirstLastPositionSortedArray {
	public int[] searchRange(int[] nums, int target) {
		int[] range = { nums.length, -1 };
		searchRange(nums, target, 0, nums.length - 1, range);
		if (range[0] > range[1])
			range[0] = -1;
		return range;
	}

	public void searchRange(int[] A, int target, int left, int right, int[] range) {
		if (left > right)
			return;
		int mid = (left + right) / 2;
		if (A[mid] == target) {
			if (mid < range[0]) {
				range[0] = mid;
				searchRange(A, target, left, mid - 1, range);
			}
			if (mid > range[1]) {
				range[1] = mid;
				searchRange(A, target, mid + 1, right, range);
			}
		} else if (A[mid] < target) {
			searchRange(A, target, mid + 1, right, range);
		} else {
			searchRange(A, target, left, mid - 1, range);
		}
	}
}
