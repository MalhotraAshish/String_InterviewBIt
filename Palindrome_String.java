package string_interviewbit;

public class Palindrome_String {
	public static void main(String args[]) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

	private static int isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		//str = str.toLowerCase();
		System.out.println(str);
		while (start <= end) {
			if (!isAlphaNumeric(str.charAt(start))) {
				start++;
			} else if (!isAlphaNumeric(str.charAt(end))) {
				end--;
			} else if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
				return 0;
			} else {
				start++;
				end--;
			}
		}
		return 1;
	}

	private static boolean isAlphaNumeric(char charAt) {

		return Character.isLetter(charAt) || Character.isDigit(charAt);
	}
}
