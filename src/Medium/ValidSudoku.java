package Medium;

import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			HashSet<Character> horizontal = new HashSet<>();
			HashSet<Character> vertical = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !horizontal.add(board[i][j]))
					return false;
				if (board[j][i] != '.' && !vertical.add(board[j][i]))
					return false;
			}
		}
		for (int i = 0; i < 7; i += 3) {
			for (int j = 0; j < 7; j += 3) {
				HashSet<Character> grid = new HashSet<>();
				for (int k = 0; k < 9; k++) {
					if (board[i + k / 3][j + k % 3] != '.' && !grid.add(board[i + k / 3][j + k % 3]))
						return false;
				}
			}
		}
		return true;
	}
}
