package Easy;

import java.math.*;

public class test {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("82457176");
		BigInteger x = new BigInteger("0"), sum = new BigInteger("0");
		int k = 24;
		for(int i = 1;i<=k;i++) {
			x = n.multiply(n);
			sum = sum.add(x);
		}
//		System.out.println(x.sqrt().toString());
		System.out.println(sum.toString());
	}
}
//6799185873894976
//6799185873894976