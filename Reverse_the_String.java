package string_interviewbit;

import java.util.Arrays;

public class Reverse_the_String {
	public static void main(String args[]) {
		String str = "       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq                 ";
		System.out.println(solve(str));
	}

	private static String solve(String str) {
		String result = "";
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words));
		for(int i = words.length-1; i>= 0; i--) {
			if(words[i].equals(" ") || words[i].equals("")) {
				continue;
			}else {
				result = result + " " + words[i].trim();
			}
		}
		return result.substring(1, result.length());
	}
}
