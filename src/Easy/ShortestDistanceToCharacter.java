package Easy;

public class ShortestDistanceToCharacter {
	public int[] shortestToChar(String S, char C) {
		int[] arr = new int[S.length()];
		int lastOccurence = 0, nextOccurence = 0;
		boolean nextFound = false, lastFound = false;
		for (int i = 0; i < S.length(); i++) {
			int j = i;
			if (i == nextOccurence) {
				while (j++ < S.length() - 1) {
					if (S.charAt(j) == C) {
						nextOccurence = j;
						nextFound = true;
						break;
					} else
						nextFound = false;
				}
			}
			if (S.charAt(i) == C) {
				arr[i] = 0;
				lastOccurence = i;
				lastFound = true;
				continue;
			}
			if (nextFound && lastFound) {
				arr[i] = Math.min(i - lastOccurence, nextOccurence - i);
			} else if (nextFound) {
				arr[i] = nextOccurence - i;
			} else {
				arr[i] = i - lastOccurence;
			}
		}
		return arr;
	}
}
