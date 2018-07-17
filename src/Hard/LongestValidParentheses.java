package Hard;

import java.util.*;

public class LongestValidParentheses {
	public static int longestValidParentheses(String input) {
		if (input == null || input.length() == 0)
			return 0;
		int max = 0;
		Stack<Integer> s = new Stack<>();
		s.push(-1);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				s.push(i);
			} else {
				s.pop();
				if (s.isEmpty()) { // Maintain index for next parentheses if stack becomes empty
					s.push(i);
				} else {
					max = Math.max(max, i - s.peek());
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(LongestValidParentheses.longestValidParentheses("(()((()))"));
	}
}
