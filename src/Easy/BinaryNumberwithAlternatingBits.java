package Easy;

public class BinaryNumberwithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		return !Integer.toBinaryString(n).contains("00") && !Integer.toBinaryString(n).contains("11");
	}
}
