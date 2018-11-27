package Easy;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		int sum = 0, leftsum = 0;
		for (int num : nums)
			sum += num;
		for (int i = 0; i < nums.length; ++i) {
			if (leftsum == sum - leftsum - nums[i])
				return i;
			leftsum += nums[i];
		}
		return -1;
	}
}
