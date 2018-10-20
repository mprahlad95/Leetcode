package Medium;

import java.util.*;

public class MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String S) {
		if (S == null || S.length() == 0)
			return 0;
		int ans = 0;
		char[] arr = S.toCharArray();
		Stack<Character> s = new Stack<>();
		for (char ch : arr) {
			if (ch == '(')
				s.push(ch);
			else if (ch == ')') {
				if (s.isEmpty() || (!s.isEmpty() && s.pop() != '('))
					ans++;
			}
		}
		if (!s.isEmpty())
			return ans + s.size();
		return ans;
	}
}
