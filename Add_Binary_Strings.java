package string_interviewbit;

public class Add_Binary_Strings {
	public static void main(String args[]) {
		String num1  = "1";
		String num2 = "1";
		System.out.println(addBinary(num1, num2));
		//System.out.println(convertBinaryToDecimal(num1));
		//System.out.println(convertDecimalToBinary(num2));
	}

	private static String addBinary(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for(int i = num1.length()-1, j = num2.length()-1; i>=0 || j>=0; i--, j--) {
			int sum = carry;
			if(i>=0) {
				sum = sum + num1.charAt(i) - '0';
			}
			if(j>=0) {
				sum = sum + num2.charAt(j) - '0';
			}
			sb.insert(0, sum%2);
			carry = sum/2;
		}
		if(carry>0) {
			sb.insert(0, carry);
		}
		return sb.toString();
	}
}
