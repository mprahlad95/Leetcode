package Easy;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int i, j = 0;
		for (i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		return ++j;
	}
}
