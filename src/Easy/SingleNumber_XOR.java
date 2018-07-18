package Easy;

public class SingleNumber_XOR {
	public int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i]; // 0 ^ N = N. N ^ N = 0
		}
		return ans;
	}
}
