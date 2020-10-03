package string_interviewbit;

public class Valid_Number {
	public static void main(String args[]) {
		String str = "";
		System.out.println(isNumber(str));
	}

	private static int isNumber(final String B) {
		int i = 0;
		String A = B.trim();
		if(B.equals("") || A.equals("")) {
			return 0;
		}
		if(A.charAt(0) == '-' || A.charAt(0) == '+') {
			i++;
		}
		for(; i<A.length()-1; i++) {
			if(A.charAt(i)>='0' && A.charAt(i) <='9') {
				continue;
			}
			if(A.charAt(i) == '.' && (A.charAt(i+1)>='0' && A.charAt(i+1) <='9')) {
				continue;
			}
			if(A.charAt(i) == 'e' && ((A.charAt(i+1)>='0' && A.charAt(i+1) <='9') || (A.charAt(i+1) == '-' || A.charAt(i+1) == '+'))) {
				if(isValidExponent(A.substring(i+1, A.length()))) {
					continue;
				}else {
					
					return 0;
				}
			}
			if(A.charAt(i) == '-' && A.charAt(i-1) == 'e') {
				continue;
			}
			else {
				return 0;
			}
		}
		if(i>=A.length()) {
			return 0;
		}
		if(A.charAt(i) == '.' || A.charAt(i) == 'e' || A.charAt(i) == 'u' || A.charAt(i) == 'f' || A.charAt(i) == 'L') {
			return 0;
		}
		
		return 1;
	}

	private static boolean isValidExponent(String str) {
		int i = 0;
		if(str.charAt(0) == '-' || str.charAt(0) == '+') {
			i++;
		}
		for(; i<str.length()-1; i++) {
			if(str.charAt(i)>='0' && str.charAt(i) <='9') {
				continue;
			}
			else {
				
				return false;
			}
		}
		return true;
	}
}
