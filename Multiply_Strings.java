package string_interviewbit;

public class Multiply_Strings {
	public static void main(String args[]) {
		String num1 = "9999999999";
		String num2 = "2";
		System.out.println(num1 + " " + Integer.MAX_VALUE);
		System.out.println(multiply(num1, num2));
	}

	private static String multiply(String a, String b) {
        int[] res = new int[a.length() + b.length()];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                res[i + j + 1] += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        int carry = 0;
        for (int i = res.length-1; i >= 0; i--) {
            int val = res[i] + carry;
            res[i] = val % 10;
            carry = val / 10;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length-1 && res[i] == 0) {
            i++;
        }
        while (i < res.length) {
            sb.append( (char) (res[i] + '0') );
            i++;
        }
        return sb.toString();
    }
}
