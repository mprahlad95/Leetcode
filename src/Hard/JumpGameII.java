package Hard;

//O(n)
public class JumpGameII {
	public int jump(int[] nums) {
		int jumps = 0, curEnd = 0, curFarthest = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			curFarthest = Math.max(curFarthest, i + nums[i]);
			if (i == curEnd) {
				jumps++;
				curEnd = curFarthest;
			}
			// Let's say the range of the current jump is [curBegin, curEnd], curFarthest is
			// the farthest point that all points in [curBegin, curEnd] can reach. Once the
			// current point reaches curEnd, then trigger another jump, and set the new
			// curEnd with curFarthest and repeat the same steps.
		}
		return jumps;
	}
}
