package Medium;

public class DeleteColumnstoMakeSorted {
	public int minDeletionSize(String[] A) {
		int d = 0;
		for (int i = 0; i < A[0].length(); i++) {
			for (int j = 1; j < A.length; j++) {
				if (A[j].charAt(i) < A[j - 1].charAt(i)) {
					d++;
					break;
				}
			}
		}
		return d;
	}
}
