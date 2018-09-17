package Easy;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
		int[] arr = new int[A.length];
		int counter = 0;
		for (int evenPtr = 0; evenPtr < A.length; evenPtr++) {
			if (A[evenPtr] % 2 == 0) {
				arr[counter++] = A[evenPtr];
			}
		}
		for (int oddPtr = 0; oddPtr < A.length; oddPtr++) {
			if (A[oddPtr] % 2 == 1) {
				arr[counter++] = A[oddPtr];
			}
		}
		return arr;
	}
}
