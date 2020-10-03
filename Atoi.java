package string_interviewbit;

public class Atoi {
	public static void main(String args[]) {
		//String str = "5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3 5 14703818 776366059B9O43393";
		String str = "-54332872018247709407 4 54";
		System.out.println(atoi(str));
	}

	private static int atoi(final String A) {
		int sum = 0;
		boolean flag = false;
		int i = 0;
		if (A.charAt(0) == '-') {
			flag = true;
			i++;
		} else if (A.charAt(0) == '+')
			i++;
		for (; i < A.length(); i++) {

			if (A.charAt(i) >= '0' && A.charAt(i) <= '9') {
				if(sum >= Integer.MAX_VALUE/10) {
					return flag == true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				}
				sum = sum * 10 + A.charAt(i) - '0';
			} else
				break;
		}
		if (flag)
			return -1 * sum;
		else
			return sum;
	}
}
