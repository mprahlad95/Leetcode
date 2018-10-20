package Easy;

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] A) {
		int[] ans = new int[A.length];
		int evenptr = 0, oddptr = 1;
		for (int num : A) {
			if (num % 2 == 0) {
				ans[evenptr] = num;
				evenptr += 2;
			} else {
				ans[oddptr] = num;
				oddptr += 2;
			}
		}
		return ans;
	}
}
