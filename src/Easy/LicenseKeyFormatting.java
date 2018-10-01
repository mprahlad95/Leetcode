package Easy;

public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		if (S == null || S.length() == 0 || K == 0)
			return "";
		S = S.replace("-", "").toUpperCase();
		StringBuilder sb = new StringBuilder(S).reverse();
		StringBuilder newsb = new StringBuilder();
		for (int i = sb.length() - 1; i >= 0; i--) {
			if ((i + 1) % K == 0 && i != sb.length() - 1)
				newsb.append("-");
			newsb.append(sb.charAt(i));
		}
		return newsb.toString();
	}
}
