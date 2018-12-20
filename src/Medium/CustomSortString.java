package Medium;

public class CustomSortString {
	public String customSortString(String S, String T) {
		if (S == null || S.length() == 0 || T == null || T.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int[] count = new int[26];

		// Store count of all characters in T
		for (char ch : T.toCharArray()) {
			count[ch - 'a']++;
		}

		// Append all characters present in S and T, to sb
		for (char ch : S.toCharArray()) {
			while (count[ch - 'a']-- > 0) {
				sb.append(ch);
			}
		}

		// Append all remaining characters, in T but absent in S, to sb
		for (char ch : T.toCharArray()) {
			while (count[ch - 'a']-- > 0) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
