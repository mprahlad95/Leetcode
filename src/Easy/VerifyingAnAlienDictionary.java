package Easy;

import java.util.*;

public class VerifyingAnAlienDictionary {
	public boolean isAlienSorted(String[] words, String order) {
		List<String> list = new ArrayList<>(Arrays.asList(words));
		List<String> newlist = new ArrayList<>(list);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int pos1 = 0, pos2 = 0;
				for (int i = 0; i < Math.min(o1.length(), o2.length()) && pos1 == pos2; i++) {
					pos1 = order.indexOf(o1.charAt(i));
					pos2 = order.indexOf(o2.charAt(i));
				}
				if (pos1 == pos2 && o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				return pos1 - pos2;
			}
		});
		return list.equals(newlist);
	}
}
