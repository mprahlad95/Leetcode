package Medium;

public class PalindromicSubstrings_naive {
	public int countSubstrings(String s) {
		if (s == null || s.length() <= 1)
			return s.length();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (isPalindrome(s.substring(i, j + 1)))
					count++;
			}
		}
		return count;
	}

	public boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
