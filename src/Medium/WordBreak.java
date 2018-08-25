package Medium;

import java.util.*;

public class WordBreak {
	public static boolean wordBreak(String s, List<String> wordDict) {
		if (s == null || s.length() == 0 || wordDict.size() == 0)
			return false;
		boolean[] dp = new boolean[s.length() + 1]; // dp[i] = true if substring(0,i) is breakable
		dp[0] = true; // break when word is found in dictionary and then continue again, and look for
						// next break until string is iterated completely
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && wordDict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i] + " ");
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		List<String> x = new ArrayList<>();
		x.add("apple");
		x.add("pen");
		wordBreak("abcapplepenapple", x);
	}
}
