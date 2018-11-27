package Easy;

public class ValidPalindromeII {
	public boolean validPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				// Delete one character from left (and right) and check for palindrome when you
				// encounter an mis-match.
				return isPalindrome(s.substring(left, right)) || isPalindrome(s.substring(left + 1, right + 1));
			}
			left++;
			right--;
		}
		return true;
	}

	public boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
