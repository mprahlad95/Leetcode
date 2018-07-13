package Medium;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int n = nums.length, canReach = 0;
		for (int i = 0; i < n; i++) {
			if (i > canReach) // check if reachable index is less than current index
				return false;
			canReach = Math.max(canReach, nums[i] + i); // highest jump from current index to max index
		}
		return true;
	}
}
