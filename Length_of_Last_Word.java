package string_interviewbit;

public class Length_of_Last_Word {
	public static void main(String args[]) {
		String str = "Hello World  ";
		System.out.println(lengthOfLastWord(str));
	}

	private static int lengthOfLastWord(String str) {
		int count = 0;
		int start = -1;
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i)!= ' ') {
				start = i;
				break;
			}
		}
		for(int i = start; i>=0; i--) {
			if(str.charAt(i) == ' ') {
				return count;
			}
			count++;
		}

		return count;
	}
}
