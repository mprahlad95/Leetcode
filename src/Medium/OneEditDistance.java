package Medium;

public class OneEditDistance {
	public boolean isOneEditDistance(String s, String t) {
		if ((s == null && t == null) || s.equals(t))
			return false;
		if (Math.abs(s.length() - t.length()) > 1) // cant't delete, replace or insert
			return false;
		int difference = 0;
		if (s.length() == t.length()) { // replace
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != t.charAt(i))
					difference++;
			}
			if (difference > 1)
				return false;
		}
		if (s.length() < t.length()) { // insert
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != t.charAt(i)) {
					return s.substring(i).equals(t.substring(i + 1));
				}
			}
		}
		if (s.length() > t.length()) { // delete
			for (int i = 0; i < t.length(); i++) {
				if (s.charAt(i) != t.charAt(i)) {
					return s.substring(i + 1).equals(t.substring(i));
				}
			}
		}
		return true;
	}
}
