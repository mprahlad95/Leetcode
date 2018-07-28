package Easy;

public class ToLowerCase {
	public String toLowerCase(String str) {
		if (str == null || str.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 92)
				sb.append((char) ((ch - 'A') + 'a'));
			else
				sb.append(ch);
		}
		return sb.toString();
	}
}
