package Easy;

import java.util.*;

public class UniqueEmailAddress {
	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < emails.length; i++) {
			StringBuilder sb = new StringBuilder();
			String[] str = emails[i].split("@");
			int j;
			for (j = 0; j < str[0].length(); j++) {
				if (str[0].charAt(j) != '.') {
					sb.append(str[0].charAt(j));
				}
				if (str[0].charAt(j) == '+') {
					sb.setLength(sb.length() - 1);
					break;
				}
			}
			sb.append("@").append(str[1]);
			set.add(sb.toString());
			sb.setLength(0);
		}
		return set.size();
	}
}
