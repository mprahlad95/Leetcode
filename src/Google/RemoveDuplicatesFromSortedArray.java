package Google;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int i, j = 1;
		for (i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1])
				nums[j++] = nums[i];
		}
		return j;
	}
}
