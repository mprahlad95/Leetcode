package Medium;

import java.util.*;

public class ReverseWordsInaString {
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0)
			return "";
		// Use stack for reversing
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String[] words = s.split("\\s+");
		for (String word : words)
			stack.push(word);
		while (!stack.isEmpty())
			sb.append(stack.pop()).append(" ");
		String ans = sb.toString().trim();
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("   a   b "));
	}
}
