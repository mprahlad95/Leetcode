package Easy;

import java.util.*;

public class ReorderLogFiles {
	public String[] reorderLogFiles(String[] logs) {
		List<String> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		for (int i = 0; i < logs.length; i++) {
			if (Character.isLetter((logs[i].substring(logs[i].indexOf(' ')).trim()).charAt(0)))
				temp.add(logs[i]);
			else
				list.add(logs[i]);
		}
		Collections.sort(temp, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String x = s1.substring(s1.indexOf(' ')).trim();
				String y = s2.substring(s2.indexOf(' ')).trim();
				if (x.equals(y))
					return s1.substring(0, s1.indexOf(' ')).compareTo(s2.substring(0, s2.indexOf(' ')));
				return x.compareTo(y);
			}
		});
		for (String s : list) {
			temp.add(s);
		}
		String[] ans = temp.toArray(new String[0]);
		return ans;
	}
}
