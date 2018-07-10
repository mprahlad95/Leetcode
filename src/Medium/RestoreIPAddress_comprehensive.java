package Medium;

import java.util.*;

public class RestoreIPAddress_comprehensive {
	public List<String> restoreIpAddresses(String s) {
		ArrayList<String> IP = new ArrayList<>();
		if (s == null)
			return IP;
		int len = s.length();
		if (len < 4 || len > 12)
			return IP;
		for (int i = 1; i < 4 && i < len - 2; i++) {
			for (int j = i + 1; j < i + 4 && j < len - 1; j++) {
				for (int k = j + 1; k < j + 4 && k < len; k++) {
					String a = s.substring(0, i);
					String b = s.substring(i, j);
					String c = s.substring(j, k);
					String d = s.substring(k);
					if ((validate(a)) && (validate(b)) && (validate(c)) && (validate(d)))
						IP.add(a + "." + b + "." + c + "." + d);
				}
			}
		}
		return IP;
	}

	public static boolean validate(String a) {
		if ((Integer.valueOf(a) > 255) || a.length() == 0 || a.length() > 3 || (a.length() > 1 && a.charAt(0) == '0'))
			return false;
		return true;
	}
}
