package Easy;

public class ReverseWordsInStringIII {
	public String reverseWords(String s) {
		if (s == null || s.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		do {
			if (s.charAt(i) != ' ')
				continue;
			else {
				sb.append(new StringBuilder(s.substring(j, i)).reverse()).append(" ");
				j = i + 1;
			}
		} while (++i < s.length());
		sb.append(new StringBuilder(s.substring(j)).reverse());
		return sb.toString();
	}
}
