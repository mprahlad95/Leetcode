package Medium;

public class ShortestWordDistanceIII {
	public int shortestWordDistance(String[] words, String word1, String word2) {
		int i1 = -1, i2 = -1, minDistance = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (word1.equals(words[i]) && word2.equals(words[i])) {
				i1 = i2;
				i2 = i;
			} else {
				if (word1.equals(words[i]))
					i1 = i;
				if (word2.equals(words[i]))
					i2 = i;
			}
			if (i1 != -1 && i2 != -1)
				minDistance = Math.min(minDistance, Math.abs(i1 - i2));
		}
		return minDistance;
	}
}
