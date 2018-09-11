package Easy;

public class RepeatedStringMatch {
	public int repeatedStringMatch(String A, String B) {
		StringBuilder sb = new StringBuilder(A);
		for (int count = 1; sb.length() <= A.length() + B.length() + 100; count++, sb.append(A)) {
			if (sb.toString().contains(B))
				return count;
		}
		return -1;
	}
}
