package Easy;

public class CountAndSay {
	public String countAndSay(int n) {
		if (n <= 1)
			return "1";
		StringBuilder sb = new StringBuilder("11");
		for (int i = 2; i < n; i++) {
			sb = helper(sb);
		}
		return sb.toString();
	}

	public StringBuilder helper(StringBuilder sb) {
		StringBuilder sb2 = new StringBuilder();
		char ch = sb.charAt(0);
		int count = 1;
		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == ch) {
				count++;
			} else {
				sb2.append(count).append(ch);
				ch = sb.charAt(i);
				count = 1;
			}
		}
		sb2.append(count).append(ch);
		return sb2;
	}
}
