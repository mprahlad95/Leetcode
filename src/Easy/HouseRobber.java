package Easy;

public class HouseRobber {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length < 2)
			return nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}
		return dp[nums.length - 1];
	}
}

/*
 * Let's suppose this array arr = [9,1,7,9] and f(n) is the function. When the
 * array is only [9], your max f(0) will be arr[0]. When the array is [9,1],
 * your max f(1) is max(arr[0], arr[1]). When the array is [9,1,7], if you
 * select 7, you can't select 1 therefore f(n-2) + arr[n]. However, if you don't
 * select 7, you max f(2) will be same as f(1) which is f(n-1). When the array
 * is [9,1,7,9], you need to drop both 1 & 7 and choose 9, 9. f(n) = max(
 * f(n-1), f(n-2)+arr[n] ) equation satisfies this case.
 */
