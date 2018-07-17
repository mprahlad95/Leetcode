package Medium;

public class CountingBits {
	public int[] countBits(int num) {
		int[] bits = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			bits[i] = bits[i / 2];
			if (i % 2 == 1)
				bits[i]++;
		}
		return bits;
	}
}
// Follows pattern of number of 1s in powers of 2