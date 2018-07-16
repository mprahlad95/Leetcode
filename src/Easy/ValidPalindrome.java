package Easy;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		return (new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase()).reverse().toString()
				.equals(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase()));
	}
}
