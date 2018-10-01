package Google_cards;

public class RepeatedStringMatch {
	public int repeatedStringMatch(String A, String B) {
		StringBuilder match = new StringBuilder();
		for (int i = 0; i < B.length() / A.length() + 2; i++) {
			match.append(A);
			if (match.toString().contains(B)) {
				return i + 1;
			}
		}
		return -1;
	}
}
