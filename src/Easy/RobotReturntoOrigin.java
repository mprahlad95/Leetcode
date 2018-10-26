package Easy;

public class RobotReturntoOrigin {
	public boolean judgeCircle(String moves) {
		if (moves == null || moves.length() == 0)
			return true;
		int x = 0, y = 0;
		for (char ch : moves.toCharArray()) {
			if (ch == 'L')
				x--;
			if (ch == 'R')
				x++;
			if (ch == 'U')
				y++;
			if (ch == 'D')
				y--;
		}
		return (x == 0 && y == 0);
	}
}
