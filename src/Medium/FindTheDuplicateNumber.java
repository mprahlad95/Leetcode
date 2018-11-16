package Medium;

public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int slow = nums[0], fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);
		int anotherslow = nums[0];
		while (slow != anotherslow) {
			anotherslow = nums[anotherslow];
			slow = nums[slow];
		}
		return slow;
	}
}
