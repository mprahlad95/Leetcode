package Medium;

import java.util.*;

public class GenerateParentheses {
	List<String> ans = new ArrayList<>();

	public List<String> generateParenthesis(int n) {
		if (n == 0)
			return ans;
		helper(0, 0, ans, "", n);
		return ans;
	}

	public void helper(int left, int right, List<String> ans, String temp, int n) {
		if (left == n && right == n) {
			ans.add(temp);
		} else {
			if (left < n) {
				helper(left + 1, right, ans, temp + "(", n);
			}
			if (right < left) {
				helper(left, right + 1, ans, temp + ")", n);
			}
		}
		return;
	}
}
