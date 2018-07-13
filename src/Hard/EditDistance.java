package Hard;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		if (word1 == null && word2 == null || word1.equals(word2))
			return 0;
		int lenA = word1.length(), lenB = word2.length(), i, j;
		int memo[][] = new int[lenA + 1][lenB + 1];
		for (i = 1; i <= lenA; i++)
			memo[i][0] = i;
		for (j = 1; j <= lenB; j++)
			memo[0][j] = j;
		for (i = 1; i <= lenA; i++) {
			char chA = word1.charAt(i - 1);
			for (j = 1; j <= lenB; j++) {
				char chB = word2.charAt(j - 1);
				if (chA == chB)
					memo[i][j] = memo[i - 1][j - 1];
				else
					memo[i][j] = (int) Math.min(1 + memo[i - 1][j - 1],
							Math.min(1 + memo[i][j - 1], 1 + memo[i - 1][j]));
			}
		}
		return memo[i - 1][j - 1];
	}
}
