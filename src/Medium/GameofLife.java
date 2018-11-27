package Medium;

public class GameofLife {
	int[][] newBoard;

	public void gameOfLife(int[][] board) {
		if (board == null || board.length == 0)
			return;
		newBoard = new int[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				checkNeighbors(board, i, j);
			}
		}
		// Copy new board to old board
		for (int i = 0; i < board.length; i++) {
			board[i] = newBoard[i].clone();
		}
	}

	public void checkNeighbors(int[][] board, int i, int j) {
		// Check 8 neighbors for given conditions
		int ones = 0;
		int[][] godir = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 }, { -1, -1 }, { -1, 1 }, { 1, -1 } };
		for (int dir[] : godir) {
			int row = i + dir[0], col = j + dir[1];

			// Check bound conditions
			if (row < 0 || col < 0 || row >= board.length || col >= board[0].length)
				continue;

			if (board[row][col] == 1)
				ones++;
		}

		// Put in all conditions
		if (board[i][j] == 1) {
			if (ones == 2 || ones == 3)
				newBoard[i][j] = 1;
			if (ones < 2 || ones > 3)
				newBoard[i][j] = 0;
		}

		else if (ones == 3)
			newBoard[i][j] = 1;
	}
}
