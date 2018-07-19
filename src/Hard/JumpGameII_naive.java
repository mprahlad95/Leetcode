package Hard;

//O(n^2) time and O(n) space
public class JumpGameII_naive {
	public int jump(int[] nums) {
		if (nums == null || nums.length < 2)
			return 0;
		int[] minJumps = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			minJumps[i] = Integer.MAX_VALUE; // else Math.min takes in all 0s
		}
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] + j >= i) {
					minJumps[i] = Math.min(minJumps[i], minJumps[j] + 1); // can store index of jumps to find path
				}
			}
		}
		return minJumps[nums.length - 1];
	}
}
