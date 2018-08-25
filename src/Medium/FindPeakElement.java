package Medium;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		if (nums == null || nums.length <= 1)
			return 0;
		int i;
		for (i = 1; i < nums.length - 1; i++) {
			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
				return i;
		}
		if (nums[i] > nums[i - 1])
			return i;
		return 0;
	}
}
