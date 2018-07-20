package Easy;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int low, int high) {
		while (low < high) {
			int tmp = nums[low];
			nums[low] = nums[high];// we firstly reverse all the elements of the array. Then, reversing the first k
			// elements followed by reversing the rest n-kn−k elements gives us the required
			// result.
			nums[high] = tmp;
			low++;
			high--;
		}
	}
}
