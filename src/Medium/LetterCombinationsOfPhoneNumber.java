package Medium;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
	String[] keys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if (digits == null || digits.length() == 0)
			return result;
		combination(result, new StringBuilder(), digits, 0);
		return result;
	}

	public void combination(List<String> result, StringBuilder sb, String digits, int position) {
		if (position == digits.length()) {
			result.add(sb.toString());
			return;
		}
		int index = digits.charAt(position) - '0';
		for (int i = 0; i < keys[index].length(); i++) {
			sb.append(keys[index].charAt(i));
			combination(result, sb, digits, position + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
