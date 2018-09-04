package Easy;

public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		int i1 = -1, i2 = -1, min = Integer.MAX_VALUE;
		boolean found1 = false, found2 = false;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				i1 = i;
				found1 = true;
			} else if (words[i].equals(word2)) {
				i2 = i;
				found2 = true;
			}
			if (found1 && found2)
				min = Math.min(min, Math.abs(i1 - i2));
		}
		return min;
	}
}
