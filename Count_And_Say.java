package string_interviewbit;

public class Count_And_Say {
	public static void main(String args[]) {
		int n = 8;
		System.out.println(countAndSay(n));
	}

	private static String countAndSay(int n) {
		if(n == 1) {
			return "1";
		}
		if(n == 2) {
			return "11";
		}
		StringBuilder sb = new StringBuilder();
		String num = countAndSay(n-1);
		//System.out.println(num);
		int count = 1;
		for(int i = 1; i<num.length(); i++) {
			if(num.charAt(i) == num.charAt(i-1)) {
				count++;
				//System.out.println("count = " + count + " for num = " + num.charAt(i-1));
			}else {
				//System.out.println("count = " + count + " for num = " + num.charAt(i-1));
				sb.append(count).append(num.charAt(i-1));
				count = 1;
			}
		}
		//System.out.println(count);
		if(count>0) {
			sb.append(count).append(num.charAt(num.length()-1));
		}
		return sb.toString();
	}

}
