package Medium;

public class LongestPalindromicSubstring_DP {
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		boolean[][] dp = new boolean[s.length()][s.length()];
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			dp[i][i] = true;// all characters by itself
		}
		int start = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				start = i;
				max = 2;
				dp[i][i + 1] = true;
			}
		}
		for (int k = 3; k <= s.length(); ++k) {
			for (int i = 0; i < s.length() - k + 1; ++i) {
				int j = i + k - 1;
				if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
					dp[i][j] = true;
					if (k > max) {
						start = i;
						max = k;
					}
				}
			}
		}
		return s.substring(start, start + max);
	}
}
