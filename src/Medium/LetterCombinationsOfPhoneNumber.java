package Medium;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
	String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0)
			return new ArrayList<String>();
		return helper(new ArrayList<String>(), new StringBuilder(), digits, 0);
	}

	public List<String> helper(List<String> list, StringBuilder sb, String digits, int position) {
		if (sb.length() == digits.length()) {
			list.add(sb.toString());
			return list;
		}
		// Extract digit in numeric form
		int index = digits.charAt(position) - '0';
		for (int i = 0; i < letters[index].length(); i++) {
			// Append all characters represented by that digit
			sb.append(letters[index].charAt(i));
			helper(list, sb, digits, position + 1);
			sb.setLength(sb.length() - 1);
		}
		return list;
	}
}
