package Google;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int i, j = 0, count = 0;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else
				nums[j++] = nums[i];
		}
		while (count-- > 0)
			nums[--i] = 0;
	}
}
