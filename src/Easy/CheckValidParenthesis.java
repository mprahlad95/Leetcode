package Easy;

import java.util.*;

public class CheckValidParenthesis {
	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		if (s.length() < 2)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;
				char test = stack.pop();
				if (Math.abs(test - ch) > 2 || test - ch == 0)
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
}
