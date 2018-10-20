package Google;

import java.util.*;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		if (s.length() < 2)
			return false;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;
				char topElement = stack.pop();
				if ((topElement == '(' && ch != ')') || (topElement == '[' && ch != ']')
						|| (topElement == '{' && ch != '}'))
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
}
