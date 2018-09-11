package Easy;

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (char ch : S.toCharArray()) {
			if (ch == '#') {
				if (sb1.length() <= 1) {
					sb1.setLength(0);
				} else
					sb1.setLength(sb1.length() - 1);
			} else
				sb1.append(ch);
		}
		for (char ch : T.toCharArray()) {
			if (ch == '#') {
				if (sb2.length() <= 1) {
					sb2.setLength(0);
				} else
					sb2.setLength(sb2.length() - 1);
			} else
				sb2.append(ch);
		}
		return sb1.toString().equals(sb2.toString());
	}
}
