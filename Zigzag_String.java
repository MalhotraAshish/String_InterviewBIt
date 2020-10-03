package string_interviewbit;

public class Zigzag_String {
	public static void main(String args[]) {
		String str = "PAYPALISHIRING";
		int rowCount = 3;
		System.out.println("PAHNAPLSIIGYIR");
		System.out.println(convert(str, rowCount));
	}

	private static String convert(String A, int B) {
		if (B <= 1) {
			return A;
		}

		StringBuilder[] sbArr = new StringBuilder[B];
		for (int i = 0; i < B; i++) {
			sbArr[i] = new StringBuilder();
		}

		int index = 0;
		while (index < A.length()) {
			for (int i = 0; i < B && index < A.length(); i++, index++) {
				sbArr[i].append(A.charAt(index));
			}
			for (int j = B - 2; j > 0 && index < A.length(); j--, index++) {
				sbArr[j].append(A.charAt(index));
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < B; i++) {
			sb.append(sbArr[i].toString());
		}

		return sb.toString();
	}
}
