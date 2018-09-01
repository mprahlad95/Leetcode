package Easy;

public class ReverseStringII {
	public String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		int i = 0;
		while (i < s.length()) {
			if (i == 0 && k > s.length()) {
				return new StringBuilder(s.substring(0)).reverse().toString();
			}
			if (flag && i + k <= s.length()) {
				sb.append(new StringBuilder(s.substring(i, i + k)).reverse());
				i += k;
				flag = !flag;
				continue;
			} else if (!flag && i + k <= s.length()) {
				sb.append(s.substring(i, i + k));
				i += k;
				flag = !flag;
				continue;
			} else if (flag && i + k > s.length()) {
				sb.append(new StringBuilder(s.substring(i)).reverse());
				break;
			} else if (!flag && i + k > s.length()) {
				sb.append(s.substring(i));
				break;
			}
		}
		return sb.toString();
	}
}
