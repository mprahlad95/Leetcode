package Hard;

public class SudokuSolver {
	public void solveSudoku(char[][] board) {
		helper(board);
	}

	public boolean helper(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					for (char k = '1'; k <= '9'; k++) {
						if (isValidSudoku(board, i, j, k)) {
							board[i][j] = k;
							// Recursively try all possibilities
							if (helper(board))
								return true;
							else
								board[i][j] = '.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public boolean isValidSudoku(char[][] board, int row, int col, char ch) {
		// Check only row, column and cube of the row and column of the character
		for (int i = 0; i < 9; i++) {
			// Row check
			if (board[i][col] != '.' && board[i][col] == ch)
				return false;
			// Column Check
			if (board[row][i] != '.' && board[row][i] == ch)
				return false;
			// 3x3 cube check
			int rowindex = 3 * (row / 3) + (i / 3), colindex = 3 * (col / 3) + (i % 3);
			if (board[rowindex][colindex] != '.' && board[rowindex][colindex] == ch)
				return false;
		}
		return true;
	}
}
