package Medium;

import java.util.*;

public class PalindromePartitioning {
	public static List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<>();
		if (s == null || s.length() == 0)
			return list;
		backtrack(s, list, new ArrayList<String>(), 0);
		return list;
	}

	public static void backtrack(String s, List<List<String>> list, List<String> tempList, int start) {
		if (start == s.length()) {
			list.add(new ArrayList<String>(tempList));
		} else {
			for (int i = start; i < s.length(); i++) {
				if (isPalindrome(s, start, i)) {
					tempList.add(s.substring(start, i + 1));
					backtrack(s, list, tempList, i + 1);
					tempList.remove(tempList.size() - 1);
				}
			}
		}
	}

	public static boolean isPalindrome(String s, int low, int high) {
		while (low < high)
			if (s.charAt(low++) != s.charAt(high--))
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(partition("aab"));
	}
}
