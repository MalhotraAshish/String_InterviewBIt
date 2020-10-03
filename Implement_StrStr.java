package string_interviewbit;

public class Implement_StrStr {
	public static void main(String args[]) {
		final String mainString = "babbaaabaaaabbababaaabaabbbbabaaaabbabbabaaaababbabbbaaabbbaaabbbaabaabaaaaababbaaaaaabababbbbba";
		final String subString = "bababbbbbbabbbaabbaaabbbaababa";
		System.out.println(strStr(mainString, subString));
	}

	private static int strStr(final String mainString, final String subString) {
		int count = 0;
		for (int i = 0,j = 0; i+j < mainString.length(); i++) {
			if (mainString.charAt(i) == subString.charAt(0)) {
				for (j = 1; i+j < mainString.length() && j < subString.length(); j++) {
					//System.out.println("i + j = " + (i+j) + " j = " + j );
					if (mainString.charAt(i + j) == subString.charAt(j)) {
						count++;
					} else {
						count = 0;
						break;
					}
				}
				if (count == (subString.length()-1)) {
					return i;
				}
			}
		}
		return -1;
	}

}
