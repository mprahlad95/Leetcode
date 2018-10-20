package Easy;

public class RepeatedSubstringMatch {
	public boolean repeatedSubstringPattern(String s) {
		return new StringBuilder(s).append(s).substring(1, s.length() * 2 - 1).contains(s);
	}
}
