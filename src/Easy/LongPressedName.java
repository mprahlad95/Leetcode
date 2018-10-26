package Easy;

public class LongPressedName {
	public boolean isLongPressedName(String name, String typed) {
		if (name == null || name.length() == 0)
			return true;
		int leftptr = 0, rightptr = 0, temprightptr = 0;
		while (leftptr < name.length() && rightptr < typed.length()) {
			int equalcount = 0;
			char ch1 = name.charAt(leftptr);
			char ch2 = typed.charAt(rightptr);
			if (leftptr > 0 && ch1 == name.charAt(leftptr - 1)) {
				rightptr = temprightptr + 1;
				ch2 = typed.charAt(rightptr);
			}
			if (ch1 == ch2) {
				temprightptr = rightptr;
				while (rightptr < typed.length() - 1 && typed.charAt(++rightptr) == ch1) {
					equalcount++;
				}
				if (equalcount == 0) {
					if (leftptr < name.length() - 1 && (name.charAt(leftptr + 1) != typed.charAt(rightptr)))
						return false;
				}
			} else
				return false;
			leftptr++;
		}
		return true;
	}
}
