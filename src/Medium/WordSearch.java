package Medium;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || word == null || word.length() == 0)
			return false;
		// Start DFS on the board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++)
				if (board[i][j] == word.charAt(0)
				&& search(board, i, j, word, 0, new boolean[board.length][board[0].length]))
					return true;
		}
		return false;
	}

	public boolean search(char[][] board, int i, int j, String word, int current, boolean[][] visited) {
		// Return true if word length equals current value
		if (current == word.length())
			return true;
		// Return false if violates boundary conditions
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j]
				|| board[i][j] != word.charAt(current))
			return false;
		// Marked current as visited
		visited[i][j] = true;
		// Search for all 4 neighbors
		if (search(board, i + 1, j, word, current + 1, visited) || search(board, i - 1, j, word, current + 1, visited)
				|| search(board, i, j + 1, word, current + 1, visited)
				|| search(board, i, j - 1, word, current + 1, visited))
			return true;
		// If path has to be changed, mark current as unvisited and return false
		visited[i][j] = false;
		return false;
	}
}
