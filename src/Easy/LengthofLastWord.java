package Easy;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		s = " " + s;
		return s.substring(s.lastIndexOf(" ")).length() - 1;
	}
}
