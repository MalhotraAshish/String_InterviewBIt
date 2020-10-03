package string_interviewbit;

import java.math.BigInteger;

public class Power_of_2 {
	public static void main(String args[]) {
		String str = "16";
		System.out.println(power(str));
	}

	private static int power(String str) {
		if(str.equals("1")) {
			return 0;
		}
		return new BigInteger(str).bitCount() == 1 ? 1:0;
	}
}
