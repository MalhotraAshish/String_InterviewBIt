package string_interviewbit;

public class Minimum_Characters_required_to_make_a_String_Palindromic {

	public static void main(String args[]) {
		String str = "ABC";
		System.out.println(solve(str));
	}

	private static int solve(String str) {
		String revString = "";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		revString = sb.reverse().toString();
		revString = str + '$' + revString;
		int list[] = computeLPSArray(revString);
		return str.length() - list[list.length - 1];
	}

	private static int[] computeLPSArray(String str) {
		int size = str.length();
		int list[] = new int[str.length()];

		int len = 0;

		list[0] = 0;
		int i = 1;
		while (i < size) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				list[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = list[len - 1];

				} else {
					list[i] = 0;
					i++;
				}
			}
		}
		return list;
	}

}
