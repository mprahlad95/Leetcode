package Easy;

public class ValidMountainArray {
	public boolean validMountainArray(int[] A) {
		if (A.length < 3)
			return false;
		boolean descFlag = false, incFlag = false;
		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i - 1]) {
				if (descFlag)
					return false;
				incFlag = true;
			}
			if (A[i] < A[i - 1]) {
				if (!incFlag)
					return false;
				descFlag = true;
			}
			if (A[i] == A[i - 1])
				return false;
		}
		return (incFlag && descFlag) ? true : false;
	}
}
