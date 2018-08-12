package Easy;

import java.util.*;

public class UncommonWordsFromTwoSentences {
	public String[] uncommonFromSentences(String A, String B) {
		if (A == null || B == null || A.length() == 0 || B.length() == 0)
			return new String[0];
		Map<String, Integer> map = new HashMap<>();
		for (String s : A.split(" ")) {
			map.merge(s, 1, (a, b) -> a + b);
		}
		for (String s : B.split(" ")) {
			map.merge(s, 1, (a, b) -> a + b);
		}
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() < 2)
				list.add(entry.getKey());
		}
		return list.toArray(new String[0]);
	}
}
