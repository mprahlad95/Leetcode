package Easy;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		int i;
		for (i = 0; i < nums.length; i++) {
			if (target == nums[i] || (target > nums[i] && target < nums[i + 1])) {
				break;
			}
		}
		return ++i;
	}
}
