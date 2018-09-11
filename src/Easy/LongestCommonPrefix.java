package Easy;

import java.util.*;

class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.length() - b.length();
			}
		});
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println(prefix);
			}
			if (prefix.length() == 0)
				return "";
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] arr = { "prahlad", "prehled", "prahled" };
		System.out.println(longestCommonPrefix(arr));
	}
}
