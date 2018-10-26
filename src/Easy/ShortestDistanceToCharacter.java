package Easy;

public class ShortestDistanceToCharacter {
	public int[] shortestToChar(String S, char C) {
		int min[] = new int[S.length()];
		int i = -1, lastC = Integer.MAX_VALUE;
		while (++i < S.length()) {
			if (S.charAt(i) == C)
				lastC = i;
			min[i] = Math.abs(i - lastC);
		}
		while (--i >= 0) {
			if (S.charAt(i) == C)
				lastC = i;
			min[i] = Math.min(min[i], Math.abs(i - lastC));
		}
		return min;
	}
}
