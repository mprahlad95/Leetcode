package Easy;

public class ReverseInteger {
	public int reverse(int x) {
		int reversed = 0;
		while (x > 0) {
			reversed = reversed * 10 + x % 10;
			x = x / 10;
		}
		return reversed;
	}
}
