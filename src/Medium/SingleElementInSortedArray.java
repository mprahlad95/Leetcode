package Medium;

public class SingleElementInSortedArray {
	public static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		int low = 0, high = n;
		while (low < high) {
			int mid = (low + high) / 2;
			if ((mid % 2 == 0 && mid + 1 < n && nums[mid] == nums[mid + 1])
					|| (mid % 2 == 1 && mid - 1 >= 0 && nums[mid] == nums[mid - 1]))
				low = mid + 1;
			else
				high = mid;
		}
		return nums[low];
	}
	public static void main(String[] args) {
		singleNonDuplicate(new int[] {3,3,7,7,10,11,11});
	}
}
