package Easy;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		if (s == null || s.length() == 0)
			return t.charAt(0);
		int ch = 0;
		for (int i = 0; i < t.length(); i++) {
			ch += (int) t.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
			ch -= (int) s.charAt(i);
		}
		return (char) ch;
	}
}
